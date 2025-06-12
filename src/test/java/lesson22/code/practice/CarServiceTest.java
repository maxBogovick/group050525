package lesson22.code.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {


    private CarService carServiceSmall;
    private CarRepository carRepositorySmall;

    private CarService carService;
    private CarRepository carRepository;



    @BeforeEach
    void setUp() {
        // создадим сервис в котором будет репозиторий с массивом размером 1 элемент
        // в который мы сможем добавить данные о автомобилях
        // а также проверить сценарий "полного" каталога

        carRepositorySmall = new CarRepository(1);
        carServiceSmall = new CarService(carRepositorySmall);

        carRepository = new CarRepository(10);
        carService = new CarService(carRepository);
        carService.fillSampleCars();
    }

    @Test
    void testAddCarSuccess() {
        String addResultMessage = carServiceSmall.addCar("testNumber", "TestBrand", 20000);

        assertEquals("Автомобиль успешно добавлен", addResultMessage);
    }

    @Test
    void testAddCarFailureWhenFull() {
        String addResultMessage1 = carServiceSmall.addCar("testNumber1", "TestBrand1", 20000);
        String addResultMessage2 = carServiceSmall.addCar("testNumber2", "TestBrand2", 20000);

        assertEquals("Автомобиль успешно добавлен", addResultMessage1);
        assertEquals("Автомобиль в каталог добавить не получилось",addResultMessage2);

    }

    @Test
    void testFindByCatalogNumberFound(){
        Car testedCar = new Car("testNumber","testBrand",10000);
        carService.addCar("testNumber","testBrand",10000);

        Car foundedCar = carService.findByCatalogNumber("testNumber");
        assertEquals(testedCar, foundedCar);
    }


    @Test
    void testFindByCatalogNumberNotFound(){

        Car foundedCar = carService.findByCatalogNumber("testNumber");
        // для несуществующего номера каталога возвращается null
        assertNull(foundedCar);
    }


    @Test
    void testFindByBrandCaseIgnore(){
        carService.addCar("testNumber","testBrand",10000);
        carService.addCar("testNumber","testBRAND",10000);

        Car[] foundedCars = carService.findByBrand("testBrand");
        assertEquals(2,foundedCars.length);

//        for (Car car : foundedCars){
//            System.out.println(car);
//        }
    }


    @Test
    void testFindByPriceRange(){
        carService.addCar("test1","BrandA",10000);
        carService.addCar("test2","BrandB",20000);
        carService.addCar("test3","BrandC",30000);

        Car[] isRange = carService.findByPriceRange(15000,30000);

        assertEquals(2, isRange.length, "Ожидаем 2 автомобиля в диапазоне от 15 до 30 тысяч");

        for (Car car : isRange){
            assertTrue(car.getPrice() >= 15000 && car.getPrice() <= 30000,
                    "Цена должна быть внутри заданного диапазона");
        }

    }



}