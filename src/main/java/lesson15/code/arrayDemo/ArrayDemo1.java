package lesson15.code.arrayDemo;

public class ArrayDemo1 {
    public static void main(String[] args) {

        // заранее знаем сколько будет пациентов

        int pacientQuantity = 5;

        // создадим массив для хранения String переменных
        // такого размера как нам нужно

        //String[] pacients = new String[5];
        // абсолютно одинаково с точки зрения Java
        String[] pacients = new String[pacientQuantity];

        pacients[0] = "Ruslan";
        pacients[1] = "Olga";
        pacients[2] = "Victor";
        pacients[3] = "Alex";
        pacients[4] = "Valera";

        // запросим у пациента номер его страховки

        int currentPacientNumber = 0;

        System.out.println("Номер страховки для пациента : " + pacients[currentPacientNumber]);



    }
}
