package lesson06.code.classConstructor;

public class Library {
    /*
    создать класс для учета книг в библиотеке
    в момент создания класса - задать сразу его параметры
    написать методы которые бы "выдавали" книгу читателю и "возвращали" книгу
    написать метод который выводит информацию о библиотеке
     */

    String name;
    String address;
    int quantity;

    public Library(String name, String address, int quantity) {
        this.name = name;
        this.address = address;
        this.quantity = quantity;
    }

    // "выдаем" книгу

    public void issueBook() {
        quantity = quantity - 1;
        System.out.println("Выдали книгу читателю");
    }

    public void returnBook() {
        quantity = quantity + 1;
        System.out.println("Читатель вернул книгу");
    }

    public void printInfo(){
        System.out.println("Название библиотеки:" + name);
        System.out.println("Адрес: " + address);
        System.out.println("Количество книг в наличии: " + quantity);
        System.out.println("-----------------------------------------------");
    }
}
