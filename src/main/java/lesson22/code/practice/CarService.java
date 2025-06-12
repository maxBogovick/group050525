package lesson22.code.practice;

public class CarService {

    private CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    /*
    список методов для сервиса:
    - добавить
    - найти по номеру каталога
    - найти по марке
    - найти про диапазону цен
    - найти все
     */

    public String addCar(String catalogNumber, String brand, double price){
        // можем проверить (validation) содержимое полученных данных
        // и если критерии проверки будут соблюдены - то идем дальше

        Car car = new Car(catalogNumber,brand,price);
        boolean addResult = repository.add(car);

        if (addResult) {
            return "Автомобиль успешно добавлен";
        } else {
            return "Автомобиль в каталог добавить не получилось";
        }

    }

    public Car findByCatalogNumber(String catalogNumber){
        return repository.findCarByCatalogNumber(catalogNumber);
    }

    public Car[] findByBrand(String brand){
        return repository.findByBrand(brand);
    }

    public Car[] findByPriceRange(double minPrice, double maxPrice){
        if (maxPrice < minPrice) {
            // если пользователь ошибся при вводе диапазона цен,
            // то поменяем местами значения в переменных
            double temp = maxPrice;
            maxPrice = minPrice;
            minPrice = temp;
        }
        return repository.findByPriceRange(minPrice, maxPrice);
    }

    public Car[] getAllCars(){
        return repository.findAll();
    }

    // -------- для текущей задачи создадим метод первоначального автоматического заполнения каталога ----

    public void fillSampleCars(){
        addCar("A1","Mercedes", 49000);
        addCar("B2","BMW", 65000);
        addCar("C3","Tesla", 44700);
        addCar("D4","Audi", 40000);
        addCar("E5","Toyota", 33000);
    }
}
