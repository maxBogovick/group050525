package lesson07.code.practice.task2;

public class Product {

    private String productName;
    private int quantity;
    private int cost;

    public Product(String productName, int quantity, int cost) {
        this.productName = productName;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
