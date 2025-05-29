package lesson10.code.practice.pizza.var3;

public class PizzaDemo {
    public static void main(String[] args) {

        Pizza pizzaSmall = new Pizza(24,40);
        Pizza pizzaBig = new Pizza(28,40);

        double smallPizzaCalories = pizzaSmall.totalCaloriesInPizza();

        double bigPizzaCalories = pizzaBig.totalCaloriesInPizza();

        System.out.println("Разница в калориях составляет: " + (bigPizzaCalories - smallPizzaCalories));


    }
}
