package lesson07.code.practice.task1;

public class User {
    private String name;
    private String email;
    private String address;
    private String password;
    private String department;

    public User(String name, String email, String address, String password, String department) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
