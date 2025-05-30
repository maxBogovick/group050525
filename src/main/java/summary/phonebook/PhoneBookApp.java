package summary.phonebook;

import lesson11.code.ifStatement.UserInputStatic;
import summary.phonebook.model.Contact;
import summary.phonebook.model.ContactShortInfo;
import summary.phonebook.service.ContactService;

import java.util.Arrays;

public class PhoneBookApp {

    public static void main(String[] args) {
        ContactService contactService = new ContactService();
        boolean exit = false;
        while (!exit) {
            switch (UserInputStatic.inputInt("Выберите один из пунктов меню (1 - создание, 2 - удаление, 3 - поиск, 4 - вывести все, 0 - выход)")) {
                case 0: {
                    exit = true;
                    break;
                }
                case 1: {
                    String name = UserInputStatic.inputText("Введите имя контакта");
                    String phone = UserInputStatic.inputText("Введите номер телефона контакта");
                    String email = UserInputStatic.inputText("Введите адрес электронной почты контакта");
                    contactService.save(name, phone, email);
                    break;
                }
                case 2: {
                    String name = UserInputStatic.inputText("Введите имя контакта");
                    contactService.remove(name);
                    break;
                }
                case 3: {
                    String name = UserInputStatic.inputText("Введите имя контакта");
                    ContactShortInfo[] contacts = contactService.findAll(name);
                    if (contacts == null || contacts.length == 0) {
                        System.out.println("Контакты  не удалось найти");
                    } else  {
                        System.out.println(Arrays.toString(contacts));
                    }
                    break;
                }
                case 4: {
                    ContactShortInfo[] contacts = contactService.findAll();
                    if (contacts.length == 0 ) {
                        System.out.println("Список контактов пуст");
                    } else {
                        System.out.println(Arrays.toString(contacts));
                    }
                    break;
                }
                default: {
                    System.out.println("Нужно ввести цифры 0,1,2,3,4");
                }
            }
        }
    }
}
