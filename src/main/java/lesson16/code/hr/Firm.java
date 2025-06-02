package lesson16.code.hr;

import java.util.Arrays;

public class Firm {

    private String companyName;

    private Employee director;

    private Department[] departments;

    public Firm(String companyName, Employee director, Department[] departments) {
        this.companyName = companyName;
        this.director = director;
        this.departments = departments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Employee getDirector() {
        return director;
    }

    public Department[] getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "companyName='" + companyName + '\'' +
                ", director=" + director +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}
