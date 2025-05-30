package summary.phonebook.repository;

import summary.phonebook.model.Contact;

import java.util.Arrays;

// CRUD operation (create read update delete)
public class ContactRepository {

    private Contact[] contacts;
    private int index = 0;

    public ContactRepository(int initialLength) {
        this.contacts = new Contact[initialLength]; // [10] => [null,null,null,null,null,null,null,null,null,null]
    }

    // добавление объекта контакт в массив контактов
    // если у нас не получилось добавить контакт в массив контактов, то вернем false, иначе true
    public boolean save(Contact contact) {
        if (index < contacts.length) {
            contacts[index] = contact;
            index = index + 1;
            return true;
        }
        System.out.println("Массив контактов переполнен!!!");
        return false;
    }

    // удаление контакта по названию из массива контактов
    public boolean deleteByName(String name) {
        for (int i = 0; i < index; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                // копирование из массива contacts с индекса на один больше в массив contacts
                // в индекс который содержит название равное названию переданному пользователем и количество елементов
                // будет находиться по формуле index - i - 1
                System.arraycopy(contacts, i + 1, contacts, i, index - i - 1);
                index = index - 1;
                contacts[index] = null;
                return true;
            }
        }
        return false;
    }

    // поиск контакт по его имени
    public Contact findByName(String name) {
        for (int i = 0; i < index; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                return contacts[i];
            }
        }
        return null;
    }

    // поиск контакт по какому-то полю
    public Contact[] findByField(String name, String field) {
        Contact[] result = new Contact[index];
        int count = 0;
        for (int i = 0; i < index; i++) {
            switch (field) {
                case "name": {
                    if (contacts[i].getName().contains(name)) {
                        result[count++] = contacts[i];
                    }
                    break;
                }
                case "phone": {
                    if (contacts[i].getPhone().contains(name)) {
                        result[count++] = contacts[i];
                    }
                    break;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }

    // поиск контакт по его имени
    public Contact findByContainsPhone(String name) {
        Contact[] result = new Contact[index];
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (contacts[i].getPhone().contains(name)) {
                return contacts[i];
            }
        }
        return null;
    }

    public Contact[] findAll() {
        return Arrays.copyOf(contacts, index);
    }
}
