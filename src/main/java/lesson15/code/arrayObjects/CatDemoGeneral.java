package lesson15.code.arrayObjects;

import lesson11.code.ifStatement.UserInputStatic;

import java.util.Arrays;

public class CatDemoGeneral {
    public static void main(String[] args) {

        // запросим у пользователя количество котов

        int catsQuantity = UserInputStatic.inputInt("Введите количество домашних питомцев:");

        // создаем массив

        Cat[] cats = new Cat[catsQuantity];

        // заполним это массив

        for (int i = 0; i < cats.length; i++) {
            String catName = UserInputStatic.inputText("Введите имя кошки / кота:");
            Cat cat = new Cat(catName);
            // на каждой итерации цикла у нас будет создаваться НОВЫЙ объект класса Cat
            cats[i] = cat; // в очередную ячейку положили новую кошку
        }

        System.out.println(Arrays.toString(cats));

        System.out.println("Распечатаем имя кота из элемента массива № 2");

        System.out.println(cats[2].getName());
    }
}
