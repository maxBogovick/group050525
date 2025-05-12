package lesson05.code.createClasses;

public class CarDemo {
    public static void main(String[] args) {

        // создать класс Car в котором объявить переменные,
        // необходимые для описания характеристик автомобиля

        // создаем в память НОВЫЙ объект на основе шаблона,
        // который записан в классе Car
        // и сохраняем ссылку на этот объект в переменной car1

        Car car1 = new Car();

        // теперь используя переменную car1 и ссылку, которая в ней хранится
        // мы можем положить нужные нам значения в переменные это объекта

        car1.catalogNumber = 1;
        car1.model = "Mercedes GLC 250";
        car1.color = "Black";
        car1.isAutomate = true;
        car1.numberDoors = 4;
        car1.sizeOfWheels = 21;
        car1.isDiesel = true;
        car1.volumeEngine = 2500;

        // ----- вывод данных, хранящихся в объекте -----

        System.out.println("Наш автомобиль: ");
        System.out.println("Номер по каталогу: " + car1.catalogNumber);
        System.out.println("Модель: " + car1.model);
        System.out.println("Цвет: " + car1.color);
        System.out.println("Коробка автомат (да / нет): " + car1.isAutomate);
        System.out.println("Количество дверей: " + car1.numberDoors);
        System.out.println("Размер колес: " + car1.sizeOfWheels);
        System.out.println("Топливо дизель (да/нет): " + car1.isDiesel);
        System.out.println("Объем двигателя: " + car1.volumeEngine);


        // --- создадим второй автомобиль ----

        Car car2 = new Car();

        car2.catalogNumber = 2;
        car2.model = "Aston Martin DB9";
        car2.color = "Silver";
        car2.isAutomate = false;
        car2.numberDoors = 2;
        car2.sizeOfWheels = 23;
        car2.isDiesel = false;
        car2.volumeEngine = 3800;

        // ----- вывод данных, хранящихся в объекте -----

        System.out.println("-------------------------------");
        System.out.println("Наш автомобиль: ");
        System.out.println("Номер по каталогу: " + car2.catalogNumber);
        System.out.println("Модель: " + car2.model);
        System.out.println("Цвет: " + car2.color);
        System.out.println("Коробка автомат (да / нет): " + car2.isAutomate);
        System.out.println("Количество дверей: " + car2.numberDoors);
        System.out.println("Размер колес: " + car2.sizeOfWheels);
        System.out.println("Топливо дизель (да/нет): " + car2.isDiesel);
        System.out.println("Объем двигателя: " + car2.volumeEngine);




    }
}
