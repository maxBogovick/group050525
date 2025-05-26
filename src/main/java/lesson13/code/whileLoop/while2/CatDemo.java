package lesson13.code.whileLoop.while2;

import lesson11.code.ifStatement.UserInputStatic;

public class CatDemo {
    public static void main(String[] args) {
        /*
        создайте несколько экземпляров (например три) класса Cat для регистрации в ветеринарной клинике
         */

        String catName1 = UserInputStatic.inputText("Введите имя первой кошки: ");
        Cat cat1 = new Cat(catName1);
        System.out.println("Кошка: " + cat1.getName() + " зарегистрирована в журнале");

        String catName2 = UserInputStatic.inputText("Введите имя первой кошки: ");
        Cat cat2 = new Cat(catName2);
        System.out.println("Кошка: " + cat2.getName() + " зарегистрирована в журнале");

        String catName3 = UserInputStatic.inputText("Введите имя первой кошки: ");
        Cat cat3 = new Cat(catName3);
        System.out.println("Кошка: " + cat3.getName() + " зарегистрирована в журнале");

    }
}
