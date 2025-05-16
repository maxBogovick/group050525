package lesson08.code.practice.light;

import java.util.Scanner;

public class LightService {

    private Light light;

    public LightService(Light light) {
        this.light = light;
    }

    public void switchOnOff(Scanner scanner) {
        System.out.println("Включить свет?");
        boolean isOn = scanner.nextBoolean();
        light.setOn(isOn);
    }

    public void configureBrightness(Scanner scanner) {
        System.out.println("Изменить яркость источника света на...");
        int brightness = scanner.nextInt();
        light.setBrightness(brightness);
    }

}
