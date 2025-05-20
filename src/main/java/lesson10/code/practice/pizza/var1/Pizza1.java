package lesson10.code.practice.pizza.var1;

public class Pizza1 {
    public static void main(String[] args) {

        int pizzaSmall = 24;
        int pizzaBig = 28;
        int caloriesInOne = 40;

        double countCaloriesPizzaSmall = caloriesInOne * 3.1415 * pizzaSmall * pizzaSmall / 4 ;

        double countCaloriesPizzaBig = caloriesInOne * 3.1415 * pizzaBig * pizzaBig / 4 ;

        System.out.println("Разница в калориях составляет: " + (countCaloriesPizzaBig - countCaloriesPizzaSmall));

    }
}
