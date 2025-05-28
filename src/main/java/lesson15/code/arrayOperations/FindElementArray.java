package lesson15.code.arrayOperations;

public class FindElementArray {
    public static void main(String[] args) {

        // предположим, что ужу задан массив с данными

        String[] stringArray = {"word1","word4","word2","word5","word3"};

        // задача: узнать, а есть ли среди элементов массива какое-то слово

        // пусть слово для поиска задается отдельно

        String elementForSearch = "word2";

        // алгоритм поиска - линейный (простой перебор)
        // по очереди берем каждый элемент из массива и сравниваем его с искомым значением
        // если совпало - выход из цикла
        // если дошли до конца - значит элемента в массиве нет

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(elementForSearch)) {
                System.out.println("искомый элемент найден в массиве с индексом " + i);
            }
        }
    }
}
