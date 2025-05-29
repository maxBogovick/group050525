package lesson07.code.scanner;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public String inputText(String message){
        System.out.println(message);
        String inputText = scanner.nextLine();
        return inputText;
    }


    public int inputInt(String message){
        System.out.println(message);
        int inputInt = scanner.nextInt();
        return inputInt;
    }

    public double inputDouble(String message){
        System.out.println(message);
        double inputDouble = scanner.nextDouble();
        return inputDouble;
    }

    public void close(){
        scanner.close();
    }
}
