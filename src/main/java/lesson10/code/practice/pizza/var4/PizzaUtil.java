package lesson10.code.practice.pizza.var4;

public class PizzaUtil {

    public void printDifferenceInfo(Pizza pizzaSmall, Pizza pizzaBig){
        double smallPizzaCalories = pizzaSmall.totalCaloriesInPizza();

        double bigPizzaCalories = pizzaBig.totalCaloriesInPizza();

        System.out.println("Разница в калориях составляет: " + (bigPizzaCalories - smallPizzaCalories));

    }

}
