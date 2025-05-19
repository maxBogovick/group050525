package lesson09.code.practice.task2;

class Car {
    private String model;
    private Manufacturer manufacturer;
    private String color;

    public Car(String model, Manufacturer manufacturer, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public void printCarInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Производитель: " + manufacturer.getName() + " (" + manufacturer.getCountry() + ")");
        System.out.println("Цвет: " + color);
        System.out.println();
    }
}
