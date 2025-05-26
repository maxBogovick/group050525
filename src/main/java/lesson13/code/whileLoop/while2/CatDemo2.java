package lesson13.code.whileLoop.while2;

import lesson11.code.ifStatement.UserInputStatic;

public class CatDemo2 {
    public static void main(String[] args) {
        /*
        создайте несколько экземпляров (например три) класса Cat для регистрации в ветеринарной клинике
         */

        int catCounter = 0;

        while (catCounter < 3){
            String catName = UserInputStatic.inputText("Введите имя кошки для регистрации в журнале под номером " + catCounter + " : ");
            Cat cat = new Cat(catName);
            System.out.println("Кошка: " + cat.getName() + " зарегистрирована в журнале");
            catCounter++;
        }

        System.out.println("Приняли " + catCounter + " кошек. Прием окончен");
    }
}
