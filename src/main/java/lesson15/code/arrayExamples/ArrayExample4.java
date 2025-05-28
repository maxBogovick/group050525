package lesson15.code.arrayExamples;

import lesson11.code.ifStatement.UserInputStatic;

import java.util.Arrays;

public class ArrayExample4 {
    public static void main(String[] args) {

        // запрашиваем у пользователя длину нашего массива

        int myArraySize = UserInputStatic.inputInt("Введите количество слов: ");

        // создадим массив той длины, которую указал пользователь

        String[] stringArray = new String[myArraySize];

        // java создает объект-массив с таком количеством элементов, которые мы ей указали
        // поскольку внутри этих элементов что-то должно быть, то туда помещаются
        // значение по умолчанию: для массива чисел - 0, для массива string - null,
        // для массива boolean - false

        System.out.println("Создали пустой массив из " + myArraySize + " элементов");
        System.out.println(Arrays.toString(stringArray));

        for (int i = 0; i < myArraySize; i++) {
            stringArray[i] = UserInputStatic.inputText("Введите слово");
          //^^^^^^^^^^^^^^ - мы обращаемся к элементам нашего массива по очереди
            // начиная с нулевого и сохраняем в каждый элемент данные, которые
            // только что ввел пользователь

            System.out.println(Arrays.toString(stringArray));

        }

    }
}
