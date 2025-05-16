package lesson08.code.practice.light;

import java.util.Scanner;

public class LightDemoExt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Light light1 = new Light("Лапочка на кухне");
        LightServiceExt lightServiceExt = new LightServiceExt();

        // change brightness for current light
        lightServiceExt.changeBrightness(light1, scanner);
        lightServiceExt.changeIsOn(light1, scanner);

        System.out.println("Источник света = " + light1.getLocation());
        System.out.println("Параметры источника света = " + light1.getLocation() + ":");
        System.out.println("Яркость = " + light1.getBrightness() + ",");
        System.out.println("Включен свет = " + light1.isOn() + ".");
    }
}
