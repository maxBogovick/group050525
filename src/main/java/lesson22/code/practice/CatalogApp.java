package lesson22.code.practice;

public class CatalogApp {
    public static void main(String[] args) {

        int catalogCapacity = 10;

        CarRepository carRepository = new CarRepository(catalogCapacity);
        CarService carService = new CarService(carRepository);
        UserMenu userMenu = new UserMenu(carService);

        userMenu.start();

    }
}
