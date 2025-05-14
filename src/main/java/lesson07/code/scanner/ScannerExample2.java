package lesson07.code.scanner;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {

        /*
        запросить у пользователя данные о продукте
        - производитель
        - модель
        - цена
         */
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput();

        // ----- ввод производителя ----
//        System.out.println("Введите название производителя товара:");
//        String producer = scanner.nextLine();

        String producer = userInput.inputText("Введите название производителя товара:");

                //---- ввод модели ------

        System.out.println("Введите название товара: ");
        String productName = scanner.nextLine();

        // ------ ввод цены -----
        System.out.println("Введите стоимость товара: ");
        double price = scanner.nextDouble();

        // ------ выведем всю полученную информацию о товаре -----

//        System.out.println("Производитель товара: " + producer);
//        System.out.println("Наименование товара: " + productName);
//        System.out.println("Стоимость товара: " + price);

        // создадим экземпляр класса Product с использованием введенных данных и распечатаем его

        Product product = new Product(producer,productName,price);

        System.out.println(product);

        scanner.close();

    }
}
