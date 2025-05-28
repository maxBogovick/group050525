package lesson15.code.array1;

import lesson11.code.ifStatement.UserInputStatic;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {

        // существенное отличие от вариант с переменными -
        // то что мы НЕ ОБЯЗАНЫ заранее знать сколько будет пациентов

        int pacientQuantity = UserInputStatic.inputInt("Введите количество пациентов:");


        // создадим массив для хранения String переменных
        // такого размера как нам нужно

        //String[] pacients = new String[5];
        // абсолютно одинаково с точки зрения Java
        String[] pacients = new String[pacientQuantity];


        for (int i = 0; i < pacientQuantity; i++) {
            pacients[i] =  UserInputStatic.inputText("Введите имя пациента:");
        }

        System.out.println("Наши пациенты: " );
        System.out.println(Arrays.toString(pacients));

        // запросим у пациента номер его страховки

        int currentPacientNumber = 0;

        System.out.println("Номер страховки для пациента : " + pacients[currentPacientNumber]);



    }
}
