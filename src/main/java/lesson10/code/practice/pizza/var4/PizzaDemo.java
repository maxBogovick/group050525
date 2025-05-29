package lesson10.code.practice.pizza.var4;


public class PizzaDemo {
    public static void main(String[] args) {

        PizzaUtil pizzaUtil = new PizzaUtil();

        Pizza pizzaSmall = new Pizza(24,40);

        Pizza pizzaBig = new Pizza(28,40);

        pizzaUtil.printDifferenceInfo(pizzaSmall,pizzaBig);
    }
}
