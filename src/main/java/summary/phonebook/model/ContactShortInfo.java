package summary.phonebook.model;

public class ContactShortInfo {

    private String name;
    private String phone;

    public ContactShortInfo(Contact contact) {
        this.name = contact.getName();
        this.phone = contact.getPhone();
    }

    @Override
    public String toString() {
        return "ContactShortInfo{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
