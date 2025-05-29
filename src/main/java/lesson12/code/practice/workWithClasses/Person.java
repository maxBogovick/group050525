package lesson12.code.practice.workWithClasses;

import java.util.Objects;

public class Person {
    private String personName;
    private int clientNumber;
    private int age;

    public Person(String personName, int clientNumber, int age) {
        this.personName = personName;
        this.clientNumber = clientNumber;
        this.age = age;
    }

    public String getPersonName() {
        return personName;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public int getAge() {
        return age;
    }

    /*
    Для того чтобы JAVA поняла как мы хотим сравнивать два объекта этого класса
    необходимо ее научить (объяснить).
    Для этого мы переопределяем метод equals - то есть задаем НОВЫЕ правила как надо
    сравнивать объекты.

    По умолчанию equals() сравнивает объекты по единственному критерию, которым она
    располагает - ссылки на экземпляры классов.

    Если мы переопределяем правила - то мы должны указать логику сравнения,
    то есть что с чем надо сравнивать (какие поля в классе подлежат сравнению).

    Если мы считаем, что два объекта класса Person будут считаться одинаковыми
    ТОЛЬКО если у них совпадут значения полей personName и clientNumber, то мы это
    и должны прописать в переопределенном методе equals()
     */

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return clientNumber == person.clientNumber && personName.equals(person.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, clientNumber);
    }
}
