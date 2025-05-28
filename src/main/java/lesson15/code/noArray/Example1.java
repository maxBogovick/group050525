package lesson15.code.noArray;

public class Example1 {
    public static void main(String[] args) {

        // заранее знаем сколько будет пациентов

        int pacientQuantity = 5;

        String pacientName1 = "Ruslan";
        String pacientName2 = "Olga";
        String pacientName3 = "Victor";
        String pacientName4 = "Alex";
        String pacientName5 = "Valera";

        // запросим у пациента номер его страховки

        int currentPacientNumber = 3;

        if (currentPacientNumber == 1) {
            System.out.println(pacientName1);
        }
        if (currentPacientNumber == 2) {
            System.out.println(pacientName2);
        }
        if (currentPacientNumber == 3) {
            System.out.println(pacientName3);
        }
        if (currentPacientNumber == 4) {
            System.out.println(pacientName4);
        }
        if (currentPacientNumber == 5) {
            System.out.println(pacientName5);
        }


    }
}
