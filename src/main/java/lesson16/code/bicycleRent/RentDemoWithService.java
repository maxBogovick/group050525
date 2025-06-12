package lesson16.code.bicycleRent;

public class RentDemoWithService {
    public static void main(String[] args) {

        RentService rentService = new RentService();


        // создаем массив велосипеовы

        Bicycle[] bicycles = rentService.createArrayBicycles();

        rentService.showAllBicycles(bicycles);

        // задача: подсчитать сколько у нас велосипедов городского типа


        String typeOfBike = "CityType";

        int counter = rentService.countingBicyclesByType(bicycles, typeOfBike);

        rentService.printSearchResult(counter, typeOfBike);
    }
}
