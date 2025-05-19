package lesson09.code.practice;

public class Task2 {

    public static void main(String[] args) {
        // Создаем производителей
        Manufacturer toyota = new Manufacturer("Toyota", "Япония");
        Manufacturer bmw = new Manufacturer("BMW", "Германия");

        // Создаем автомобили
        Car corolla = new Car("Corolla", toyota, "Белый");
        Car supra = new Car("Supra", toyota, "Красный");
        Car x5 = new Car("X5", bmw, "Черный");

        // Вывод информации об автомобилях
        corolla.printCarInfo();
        supra.printCarInfo();
        x5.printCarInfo();
    }
}

