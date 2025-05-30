package summary.phonebook.service;

import summary.phonebook.model.Contact;
import summary.phonebook.model.ContactShortInfo;
import summary.phonebook.repository.ContactRepository;

import java.util.Arrays;

public class ContactService {

    private ContactRepository contactRepository = new ContactRepository(10);

    // добавление объекта контакт
    // если у нас не получилось добавить контакт выводим пользователю сообщение
    public void save(String name, String phone, String email) {
        // добавить проверки входных параметров
        if (!contactRepository.save(new Contact(name, phone, email))) {
            System.out.println("Контакт с именем = " + name + " не удалось сохранить");
        } else {
            System.out.println("Контакт с именем = " + name + " удалось сохранить");
        }
    }

    // удаление контакта по названию
    public void remove(String name) {
        if (!contactRepository.deleteByName(name)) {
            System.out.println("Контакт с именем = " + name + " не удалось удалить");
        } else {
            System.out.println("Контакт с именем = " + name + " удалось удалить");
        }
    }

    // Отдать все контакты
    public ContactShortInfo[] findAll() {
        Contact[] all = contactRepository.findAll();
        if (all == null || all.length == 0) {
            return new ContactShortInfo[0];
        }
        // процесс преобразования объекта Contact в объект ContactShortInfo
        ContactShortInfo[] result = new ContactShortInfo[all.length];
        for (int i = 0; i < all.length; i++) {
            result[i] = new ContactShortInfo(all[i]);
        }
        return result;
    }

    // Найти контакт по имени, иначе вернуть null
    public ContactShortInfo findByName(String name) {
        Contact byName = contactRepository.findByName(name);
        if (byName != null) {
            return new ContactShortInfo(byName);
        }
        return null;
    }

    // метод поиска по имени и по номеру телефона
    public ContactShortInfo[] findAll(String name) {
        Contact[] byName = contactRepository.findByField(name, "name");
        Contact[] byPhone = contactRepository.findByField(name, "phone");
        Contact[] result = new Contact[byName.length + byPhone.length];
        int count = 0;
        for (int i = 0; i < byName.length; i++) {
            result[count++] = byName[i];
        }

        for (int i = 0; i < byPhone.length; i++) {
            if (!containsContact(result, byPhone[i], count)) {
                result[count++] = byPhone[i];
            }
        }

        ContactShortInfo[] resultContacts = new ContactShortInfo[result.length];
        count = 0;
        for (int i = 0; i < result.length; i++) {
            resultContacts[i] = new ContactShortInfo(result[i]);
            count++;
        }
        return Arrays.copyOf(resultContacts, count);
    }

    private boolean containsContact(Contact[] contacts, Contact contact, int count) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].equals(contact)) {
                return true;
            }
        }
        return false;
    }
}
