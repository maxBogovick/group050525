package lesson16.code.multiLevelWithArray;

import java.util.Arrays;

public class DataLowLevel {
    String[] name;

    public DataLowLevel(String[] name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DataLowLevel{" +
                "name=" + Arrays.toString(name) +
                '}';
    }
}
