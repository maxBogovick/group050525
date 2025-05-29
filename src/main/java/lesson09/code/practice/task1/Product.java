package lesson09.code.practice.task1;

class Product {
    private String productName;
    private Category category;
    private double price;
    private int quantity;

    public Product(String productName, Category category, double price, int quantity) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProductInfo() {
        System.out.println("Название: " + productName);
        System.out.println("Категория: " + category.getName());
        System.out.println("Цена: " + price + " EUR");
        System.out.println("Количество: " + quantity);
        System.out.println();
    }
}
