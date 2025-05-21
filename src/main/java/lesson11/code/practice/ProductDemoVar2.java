package lesson11.code.practice;

import lesson11.code.ifStatement.UserInputStatic;

public class ProductDemoVar2 {
    public static void main(String[] args) {
        // запросить у пользователя данные для создания нового продукта
        // создать новый продукт ТОЛЬКО если введенные данные удовлетворяют критериям:
        // - название не может быть пустым (ни одного символа или все - пробелы)
        // - цена не может быть отрицательной или 0

        // дополнительное условие для проверки наименования:
        // название продукта должно быть не менее 5 символов и не более 15

        String newProductName = UserInputStatic.inputText("Введите название продукта: ");
        int newProductPrice = UserInputStatic.inputInt("Введите цену продукта: ");


        boolean checkProductName = (!newProductName.isBlank()) && (newProductName.length() >= 5) && (newProductName.length() < 15);

        boolean checkProductPrice = newProductPrice > 0;


//        if (checkProductName && checkProductPrice) {
//            Product product = new Product(newProductName, newProductPrice);
//            System.out.println(product);
//        } else {
//            System.out.println( "Результат проверки названия продукта: " + checkProductName);
//            System.out.println( "Результат проверки стоимости продукта: " + checkProductPrice);
//
//        }


        if (checkProductName && checkProductPrice) {
            Product product = new Product(newProductName, newProductPrice);
            System.out.println(product);
        } else {

            if (checkProductName == false) {
                System.out.println("Невозможно создать новый продукт с таким названием");
            }

            if (checkProductPrice == false) {
                System.out.println("Невозможно создать новый продукт с ценой меньше или равной нулю");
            }

        }
    }
}
