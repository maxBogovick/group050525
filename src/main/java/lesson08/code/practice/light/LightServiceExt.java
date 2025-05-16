package lesson08.code.practice.light;

import java.util.Scanner;

public class LightServiceExt {

    public void changeBrightness(Light light, Scanner scanner) {
        System.out.println("Изменить яркость лампочки на ");
        int brightness = scanner.nextInt();
        light.setBrightness(brightness);

    }

    public void changeIsOn(Light light, Scanner scanner) {
        System.out.println("Включить лампочку? ");
        boolean isOn = scanner.nextBoolean();
        light.setOn(isOn);
    }
}
