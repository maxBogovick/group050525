package lesson22.code.practice;

import java.util.Objects;

public class Car {

    private String catalogNumber;
    private String brand;
    private double price;

    public Car(String catalogNumber, String brand, double price) {
        this.catalogNumber = catalogNumber;
        this.brand = brand;
        this.price = price;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return Double.compare(price, car.price) == 0 && Objects.equals(catalogNumber, car.catalogNumber) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogNumber, brand, price);
    }

    @Override
    public String toString() {
//        return "Car{" +
//                "catalogNumber='" + catalogNumber + '\'' +
//                ", brand='" + brand + '\'' +
//                ", price=" + price +
//                '}';

        return String.format("Car{ Номер каталога: '%s', марка автомобиля: '%s', цена: %.2f}",
                catalogNumber, brand, price);
    }
}
