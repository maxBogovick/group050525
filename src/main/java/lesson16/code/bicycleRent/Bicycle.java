package lesson16.code.bicycleRent;

public class Bicycle {
    private int id;
    private String model;
    private String type;
    private int price;
    private boolean isAvailable;

    public Bicycle(int id, String model, String type, int price, boolean isAvailable) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
