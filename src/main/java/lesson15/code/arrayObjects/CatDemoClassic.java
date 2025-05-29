package lesson15.code.arrayObjects;

import lesson11.code.ifStatement.UserInputStatic;

public class CatDemoClassic {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");
        Cat cat3 = new Cat("Lucky");

        // предположим, что у каждого объекта типа Cat нужно распечатать его имя

        System.out.println("У нас живут:");
        System.out.println("Имя кота: " + cat1.getName());
        System.out.println("Имя кота: " + cat2.getName());
        System.out.println("Имя кота: " + cat3.getName());

        // а что делать если объектом очень много или мы не знаем изначально их количество???

        // если нам нужно распечатать имя того кота которого выберет пользователь

        int catNumber = UserInputStatic.inputInt("Выберете какого кота нам нужно найти? (от 1 до 3)");

        switch (catNumber){
            case 1:
                System.out.println("Вы выбрали кота: " + cat1.getName());
                break;
            case 2:
                System.out.println("Вы выбрали кота: " + cat2.getName());
                break;
            case 3:
                System.out.println("Вы выбрали кота: " + cat3.getName());
                break;
            default:
                System.out.println("Такого кота у нас нет");
        }

    }
}
