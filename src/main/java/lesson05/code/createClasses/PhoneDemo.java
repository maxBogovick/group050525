package lesson05.code.createClasses;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone = new Phone();

        phone.manufacturer = "Apple";
        phone.model = "iPhone 16 Pro Max";
        phone.screenDiagonal = 6.8;
        phone.memorySize = 512;
        phone.color = "Silver";
        phone.cameraMegapixels = 48;
        phone.isTypeCCharging = true;


        System.out.println("Вывод данных о телефоне: ");


    }
}
