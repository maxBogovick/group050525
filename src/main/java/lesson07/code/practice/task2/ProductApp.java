package lesson07.code.practice.task2;

import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные о продукте: ");

        System.out.println("Введите наименование товара: ");
        String productName = scanner.nextLine();

        System.out.println("Введите количество товара: ");
        int productQuantity = scanner.nextInt();

        System.out.println("Введите цена товара: ");
        int productCost= scanner.nextInt();


        Product product = new Product(productName,productQuantity,productCost);

        // вычислим стоимость товара

        int productTotalPrice = productQuantity * productCost;

        System.out.println("Наименование товара: " + product.getProductName() + ", с общей стоимостью: " + productTotalPrice);
    }
}
