package lesson10.code.practice.pizza.var2;

public class PizzaUtil {

    public double calculateCalories(double diameter, int caloriesInOne){

        double radius = diameter / 2;

        double pizzaArea = 3.1415 * radius * radius;

        double calories = caloriesInOne * pizzaArea;

        return calories;
    }
}
