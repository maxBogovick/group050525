package lesson06.code.classConstructor;

public class Person {

    String idCode;
    String name;
    String address;

    // создадим конструктор - то есть специальный метод, который будет запускаться один раз в момент создания экземпляра класса


    public Person(String idCode, String name, String address) {
        this.idCode = idCode;
        this.name = name;
        this.address = address;
    }


    //--------------------------

    public void printInfo(){
        System.out.println("Персональный код: " + idCode +", Имя: " + name + ", адрес: " + address);
    }
}
