package lesson06.code.methodExamples;

public class Cat {

    String name;
    int age;

    public void catMeow(){
        System.out.println("Meow !!!");
    }

    public void catBirthday(){
        System.out.println("Сегодня у нашей кошки день рождения!");
        System.out.println("Ей было: " + age);

        age = age + 1;

        System.out.println("А сегодня ей стало: " + age);
    }
}
