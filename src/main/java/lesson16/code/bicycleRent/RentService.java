package lesson16.code.bicycleRent;

public class RentService {

    public Bicycle[] createArrayBicycles(){
        Bicycle bicycle1 = new Bicycle(1,"B1","CityType",200,true);
        Bicycle bicycle2 = new Bicycle(2,"B1","MountainType",220,true);
        Bicycle bicycle3 = new Bicycle(3,"B2","CityType",300,true);
        Bicycle bicycle4 = new Bicycle(4,"B2","MountainType",700,true);
        Bicycle bicycle5 = new Bicycle(5,"B3","CityType",1000,true);
        /// ///////////////////////////////////////////////////////////////////////

        Bicycle[] bicycles = {bicycle1,bicycle2,bicycle3,bicycle4,bicycle5};

        return bicycles;
    }

    public void showAllBicycles(Bicycle[] bicycles){
        System.out.println("Список доступных велосипедов: ");
        for (int i = 0; i < bicycles.length; i++) {
            System.out.println("Велосипед: ");
            System.out.println("Номер в каталоге: " + bicycles[i].getId());
            System.out.println("Модель: " + bicycles[i].getModel());
            System.out.println("Тип: " + bicycles[i].getType());
            System.out.println("Цена: " + bicycles[i].getPrice());
            System.out.println("Доступен: " + bicycles[i].isAvailable());
            System.out.println("----------------------------------");
        }
    }

    public int countingBicyclesByType(Bicycle[] bicycles, String typeOfBike){
        int bikeCounter = 0;

        for (int i = 0; i < bicycles.length; i++) {
            if (bicycles[i].getType().equals(typeOfBike)) {
                bikeCounter++;
            }
        }

        return bikeCounter;
    }


    public void printSearchResult(int bikeCounter, String typeOfBike){
        if (bikeCounter > 0 ){
            System.out.println("На складе " + bikeCounter + " велосипедов типа: " + typeOfBike);
        } else {
            System.out.println("Велосипедов типа: " + typeOfBike + " нет на складе");
        }
    }
}
