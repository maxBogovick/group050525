package lesson16.code.multiLevelStrucrure;

public class DataMiddleLevel {

    String label;

    DataLowLevel dataLowLevel;

    public DataMiddleLevel(String label, DataLowLevel dataLowLevel) {
        this.label = label;
        this.dataLowLevel = dataLowLevel;
    }

    @Override
    public String toString() {
        return "DataMiddleLevel{" +
                "label='" + label + '\'' +
                ", dataLowLevel=" + dataLowLevel +
                '}';
    }
}
