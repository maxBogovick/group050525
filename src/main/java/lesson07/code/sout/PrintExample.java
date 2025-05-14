package lesson07.code.sout;

public class PrintExample {
    public static void main(String[] args) {

        System.out.println("Печатаем текстовое сообщение");

        System.out.println("Сообщение часть 1" + ", часть 2");

        String text = "Сообщение часть 3" + ", часть 4";

        System.out.println(text);

        Dog dog = new Dog("Zeus","cane corso");
        dog.printDogInfo();

        System.out.println(dog);
    }
}
