package lesson07.code.scanner;

public class Product {

    private String producer;
    private String productName;
    private double price;

    public Product(String producer, String productName, double price) {
        this.producer = producer;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producer='" + producer + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
