package lesson06.code.methodExamples;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.name = " Мурзик";
        cat.age = 3;

        cat.catMeow();
        cat.catBirthday();

        System.out.println("Проверим содержимое переменной age: " + cat.age);
    }
}
