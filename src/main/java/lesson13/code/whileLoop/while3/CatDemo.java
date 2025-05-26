package lesson13.code.whileLoop.while3;

import lesson11.code.ifStatement.UserInputStatic;

public class CatDemo {
    public static void main(String[] args) {
        /*
        создайте несколько экземпляров (например три) класса Cat для регистрации в ветеринарной клинике
         */

        CatUtil util = new CatUtil();

        int catCounter = 0;

        while (catCounter < 3){
            Cat cat = util.createCat(catCounter);
            System.out.println("Кошка: " + cat.getName() + " зарегистрирована в журнале");
            catCounter++;
        }

        System.out.println("Приняли " + catCounter + " кошек. Прием окончен");
    }
}
