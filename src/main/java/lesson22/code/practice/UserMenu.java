package lesson22.code.practice;

import lesson11.code.ifStatement.UserInputStatic;

import java.util.Scanner;

public class UserMenu {

    private CarService catalog;
    private Scanner scanner;

    public UserMenu(int capacity) {
        catalog = new CarService(capacity);
        scanner = new Scanner(System.in);
        // предварительное заполнение
        fillSampleCars();
    }

    /**
     * Автоматически добавляет в каталог несколько автомобилей.
     */
    private void fillSampleCars() {
        catalog.addCar(new Car("A1", "Toyota", 22000));
        catalog.addCar(new Car("B2", "Honda", 18000));
        catalog.addCar(new Car("C3", "BMW", 35000));
        catalog.addCar(new Car("D4", "Audi", 40000));
        catalog.addCar(new Car("E5", "Ford", 25000));
        System.out.println("Каталог заполнен примерами (" + catalog.getSize() + " автомобилей).");
    }

    /**
     * Основной цикл меню.
     */
    public void start() {
        while (true) {
            System.out.println("=== Меню каталога автомобилей ===");
            System.out.println("1. Добавить новый автомобиль");
            System.out.println("2. Поиск по номеру");
            System.out.println("3. Поиск по марке");
            System.out.println("4. Поиск по ценовому диапазону");
            System.out.println("5. Показать все автомобили");
            System.out.println("0. Выход");
            System.out.print("Выберите опцию: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addCarInteractive();
                    break;
                case "2":
                    findByNumberInteractive();
                    break;
                case "3":
                    findByBrandInteractive();
                    break;
                case "4":
                    findByPriceRangeInteractive();
                    break;
                case "5":
                    showAllCars();
                    break;
                case "0":
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова.");
            }
        }
    }

    private void addCarInteractive() {
        String number = UserInputStatic.inputText("Введите номер в каталоге : ");
        String brand = UserInputStatic.inputText("Введите марку: ");
        double price = UserInputStatic.inputDouble("Введите цену");

        boolean added = catalog.addCar(new Car(number, brand, price));
        System.out.println(added ? "Автомобиль добавлен." : "Не удалось добавить: нет места в каталоге.");
    }

    private void findByNumberInteractive() {
        String number = UserInputStatic.inputText("Введите искомый номер: ");
        Car car = catalog.findByNumber(number);
        System.out.println(car != null ? car : "Автомобиль не найден.");
    }

    private void findByBrandInteractive() {
        String brand = UserInputStatic.inputText("Введите марку: ");
        Car[] carByBrands = catalog.findByBrand(brand);
        if (carByBrands.length == 0) {
            System.out.println("Автомобили данной марки не найдены.");
        } else {
            System.out.println("Найдено автомобилей: " + carByBrands.length);
            for (Car car : carByBrands) {
                System.out.println("  " + car);
            }
        }
    }

    private void findByPriceRangeInteractive() {
        System.out.print("Минимальная цена: ");
        double min = UserInputStatic.inputDouble("Введите минимальную цену для поиска:");
        double max = UserInputStatic.inputDouble("Введите максимальную цену для поиска:");

        Car[] carByPrice = catalog.findByPriceRange(min, max);
        if (carByPrice.length == 0) {
            System.out.println("Автомобили в этом диапазоне не найдены.");
        } else {
            System.out.println("Найдено автомобилей: " + carByPrice.length);
            for (Car car : carByPrice) {
                System.out.println("  " + car);
            }
        }
    }

    private void showAllCars() {
        System.out.println("Всего в каталоге: " + catalog.getSize());
        Car[] allCars = catalog.findAll();
        for (Car car : allCars) {
            System.out.println("  " + car);
        }
    }


}
