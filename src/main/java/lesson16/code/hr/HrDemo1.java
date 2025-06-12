package lesson16.code.hr;

import java.util.Arrays;

public class HrDemo1 {
    public static void main(String[] args) {

        // создаем сотрудников

        Employee employee1 = new Employee("Ruslan");
        Employee employee2 = new Employee("Victor");
        Employee employee3 = new Employee("Olga");
        Employee employee4 = new Employee("Alex");
        Employee employee5 = new Employee("Vadim");

        // предположим, что в нашей копании два отдела
        // для их создания нам надо создать два массива с сотрудниками

        Employee[] employeesForDep1 = {employee2, employee3};
        Employee[] employeesForDep2 = {employee4, employee5};

        // создадим два департамента
        Department department1 = new Department("Marketing", employeesForDep1);
        Department department2 = new Department("Accounting", employeesForDep2);

        // для создания компании нам необходимо создать массив из отделов

        Department[] departments = {department1,department2};

        Firm company = new Firm("SuperPuper",employee1,departments);

        //System.out.println(company);
        System.out.println("Название компании: " + company.getCompanyName());

        System.out.println("Директор компании: " + company.getDirector().getName());

        System.out.println("Количество отделов: " + company.getDepartments().length);

        for (int i = 0; i < company.getDepartments().length; i++) {
            //System.out.println(company.getDepartments()[i].getDepartmentName());
            Department[] myCompanyDepartments = company.getDepartments();
            String currentDepartmentName = myCompanyDepartments[i].getDepartmentName();
            System.out.println(currentDepartmentName);
            Employee[] currentDepartmentEmployees = myCompanyDepartments[i].getEmployees();
            System.out.println(Arrays.toString(currentDepartmentEmployees));
        }
    }
}
