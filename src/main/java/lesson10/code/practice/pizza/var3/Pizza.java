package lesson10.code.practice.pizza.var3;

public class Pizza {

    private double diameter;
    private double caloriesInOneCm;

    public Pizza(double diameter, double caloriesInOneCm) {
        this.diameter = diameter;
        this.caloriesInOneCm = caloriesInOneCm;
    }

    public double totalCaloriesInPizza(){
        double pizzaCalories = caloriesInOneCm * 3.1415 * diameter * diameter / 4;
        return pizzaCalories;
    }

}
