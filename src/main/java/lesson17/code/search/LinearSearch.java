package lesson17.code.search;

public class LinearSearch {
    public static void main(String[] args) {
        SearchInArray search = new SearchInArray();

        // предположим, что нам задан массив

        int[] arrayForSearch = {8,3,5,2,1,4,7,6};

        int elementForSearch = 5;

        // осуществим поиск

        int indexSearch = search.linearSearch(arrayForSearch, elementForSearch);

        if (indexSearch >= 0 ) {
            System.out.println("Число: " + elementForSearch + " найдено в массиве и имеет индекс: " + indexSearch);
        } else {
            System.out.println("Число: " + elementForSearch + " в массиве не найдено");
        }
    }
}
