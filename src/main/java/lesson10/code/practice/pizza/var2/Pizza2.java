package lesson10.code.practice.pizza.var2;

public class Pizza2 {
    public static void main(String[] args) {
        PizzaUtil pizzaUtil = new PizzaUtil();

        double countCaloriesPizzaSmall = pizzaUtil.calculateCalories(24, 40);

        double countCaloriesPizzaBig = pizzaUtil.calculateCalories(28, 40);

        System.out.println("Разница в калориях составляет: " + (countCaloriesPizzaBig - countCaloriesPizzaSmall));




    }
}
