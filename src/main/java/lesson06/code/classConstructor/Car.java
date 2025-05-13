package lesson06.code.classConstructor;

public class Car {

    String producer;
    String model;
    String color;
    int maxSpeed;


    public void createNewCar(String p, String m, String c, int max){
        producer = p;
        model = m;
        color = c;
        maxSpeed = max;
    }


    public void printCarInf(){
        System.out.println("Производитель: " + producer + ", модель: " + model +", цвет: " + color + ", максимальная скорость: " + maxSpeed);
    }

}
