package lesson04.code.referenceType;

public class DogDemo {
    public static void main(String[] args) {

        // предположим, что нам надо сохранить данные о собаке

        byte ageDog1 = 3;
        double weightDog1 = 50.5;

        System.out.println("Возраст собаки №1 : " + ageDog1);
        System.out.println("Вес собаки №1: " + weightDog1);

        byte ageDog2 = 4;
        double weightDog2 = 10.5;

        System.out.println("Возраст собаки №2: " + ageDog2);
        System.out.println("Вес собаки №2: " + weightDog1);

        // а теперь то же самое, но с использованием класса Dog

        Dog myDog1 = new Dog();

        System.out.println(myDog1);


        Dog myDog2 = new Dog();

        System.out.println(myDog2);

        // как использовать ЭТО???


        // сохраним значения в переменные, которые находятся в первом экземпляре класса Dog

        myDog1.age = 3;
        myDog1.weight = 50.5;


        // сохраним значения в переменные, которые находятся во втором экземпляре класса Dog

        myDog2.age = 5;
        myDog2.weight = 10.5;


        // а теперь распечатаем значения из этих объектов

        System.out.println("Возраст собаки: " + myDog1.age);


        Dog myDog3 = new Dog();



    }
}
