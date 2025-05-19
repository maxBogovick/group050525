package lesson09.code.metodsWithReturnReference.manager;

public class Manager {

    private String name;
    private String email;

    public Manager(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
