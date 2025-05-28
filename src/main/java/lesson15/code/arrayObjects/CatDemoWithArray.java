package lesson15.code.arrayObjects;

import lesson11.code.ifStatement.UserInputStatic;

public class CatDemoWithArray {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");
        Cat cat3 = new Cat("Lucky");

        // кто-то заранее создал этих котов и передал нам для работы

        //Cat[] cats = new Cat[3];
        Cat[] cats = {cat1, cat2, cat3};


        // предположим, что у каждого объекта типа Cat нужно распечатать его имя

        System.out.println("У нас живут:");
        System.out.println("Имя кота: " + cats[0].getName());
        System.out.println("Имя кота: " + cats[1].getName());
        System.out.println("Имя кота: " + cats[2].getName());

        // а что делать если объектом очень много или мы не знаем изначально их количество???

        System.out.println("Или с помощью цикла:");


    }
}
