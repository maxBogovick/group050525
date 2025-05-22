package lesson12.code.practice.workWithClasses;

public class PersonCompare {
    public static void main(String[] args) {

        String personName1 = "Ruslan";
        int clientNumber1 = 1;
        int age1 = 35;

        String personName2 = "Ruslan";
        int clientNumber2 = 1;
        int age2 = 36;


        Person person1 = new Person(personName1,clientNumber1,age1);
        Person person2 = new Person(personName2,clientNumber2,age2);

       // boolean compareResult = person1.equals(person2);

        System.out.println(person1.equals(person2));

    }
}
