package ch.epfl.scala.bsp4j;

import com.google.gson.annotations.JsonAdapter;
import org.eclipse.lsp4j.jsonrpc.json.adapters.EnumTypeAdapter;

@JsonAdapter(EnumTypeAdapter.Factory.class)
public enum ExcludeItemKind {

    FILE(1),
    DIRECTORY(2);

    private final int value;

    ExcludeItemKind(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ExcludeItemKind forValue(int value) {
        ExcludeItemKind[] allValues = ExcludeItemKind.values();
        if (value < 1 || value > allValues.length)
            throw new IllegalArgumentException("Illegal enum value: " + value);
        return allValues[value - 1];
    }
}
