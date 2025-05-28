package lesson15.code.noArray;

import lesson11.code.ifStatement.UserInputStatic;

public class Example2 {
    public static void main(String[] args) {

        // заранее знаем сколько будет пациентов

        int pacientQuantity = 5;

        String pacientName1 = "";
        String pacientName2 = "";
        String pacientName3 = "";
        String pacientName4 = "";
        String pacientName5 = "";


        for (int i = 0; i < pacientQuantity; i++) {

            String pacientName = UserInputStatic.inputText("Введите имя пациента:");

            if (i == 0) {
                pacientName1 = pacientName;
            }
            if (i == 1) {
                pacientName2 = pacientName;
            }
            if (i == 2) {
                pacientName3 = pacientName;
            }
            if (i == 3) {
                pacientName4 = pacientName;
            }
            if (i == 4) {
                pacientName5 = pacientName;
            }
        }

    }
}
