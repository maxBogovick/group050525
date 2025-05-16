package lesson08.code.practice.light;

import java.util.Scanner;

public class LightDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Light light1 = new Light("Лапочка на кухне");
        LightService lightService = new LightService(light1);

        lightService.switchOnOff(scanner);
        lightService.configureBrightness(scanner);

        System.out.println("Источник света = " + light1.getLocation());
        System.out.println("Параметры источника света = " + light1.getLocation() + ":");
        System.out.println("Яркость = " + light1.getBrightness() + ",");
        System.out.println("Включен свет = " + light1.isOn() + ".");
    }
}
