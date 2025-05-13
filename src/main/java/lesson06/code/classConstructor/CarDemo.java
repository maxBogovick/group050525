package lesson06.code.classConstructor;

public class CarDemo {
    public static void main(String[] args) {

        Car mercedes  = new Car();
        mercedes.producer = "Mercedes - Benz";
        mercedes.model = "GLC 250";
        mercedes.color = "black";
        mercedes.maxSpeed = 280;

        mercedes.printCarInf();

        Car bmw  = new Car();
        bmw.producer = "BMW";
        bmw.model = "X1";
        bmw.color = "blue";
        bmw.maxSpeed = 300;

        bmw.printCarInf();

        Car tesla = new Car();
        tesla.createNewCar("Tesla","Y","white",250);
        tesla.printCarInf();


    }
}
