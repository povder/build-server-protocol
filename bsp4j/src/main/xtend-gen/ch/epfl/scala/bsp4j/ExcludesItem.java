package ch.epfl.scala.bsp4j;

import java.util.List;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.lsp4j.util.Preconditions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class ExcludesItem {
  @NonNull
  private BuildTargetIdentifier target;

  @NonNull
  private List<ExcludeItem> excludes;

  private List<String> roots;

  public ExcludesItem(@NonNull final BuildTargetIdentifier target, @NonNull final List<ExcludeItem> excludes) {
    this.target = target;
    this.excludes = excludes;
  }

  @Pure
  @NonNull
  public BuildTargetIdentifier getTarget() {
    return this.target;
  }

  public void setTarget(@NonNull final BuildTargetIdentifier target) {
    this.target = Preconditions.checkNotNull(target, "target");
  }

  @Pure
  @NonNull
  public List<ExcludeItem> getExcludes() {
    return this.excludes;
  }

  public void setExcludes(@NonNull final List<ExcludeItem> excludes) {
    this.excludes = Preconditions.checkNotNull(excludes, "excludes");
  }

  @Pure
  public List<String> getRoots() {
    return this.roots;
  }

  public void setRoots(final List<String> roots) {
    this.roots = roots;
  }

  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("target", this.target);
    b.add("excludes", this.excludes);
    b.add("roots", this.roots);
    return b.toString();
  }

  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ExcludesItem other = (ExcludesItem) obj;
    if (this.target == null) {
      if (other.target != null)
        return false;
    } else if (!this.target.equals(other.target))
      return false;
    if (this.excludes == null) {
      if (other.excludes != null)
        return false;
    } else if (!this.excludes.equals(other.excludes))
      return false;
    if (this.roots == null) {
      if (other.roots != null)
        return false;
    } else if (!this.roots.equals(other.roots))
      return false;
    return true;
  }

  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.target== null) ? 0 : this.target.hashCode());
    result = prime * result + ((this.excludes== null) ? 0 : this.excludes.hashCode());
    return prime * result + ((this.roots== null) ? 0 : this.roots.hashCode());
  }
}
