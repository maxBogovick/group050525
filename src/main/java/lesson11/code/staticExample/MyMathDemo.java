package lesson11.code.staticExample;

public class MyMathDemo {
    public static void main(String[] args) {

        // MyMath myMath = new MyMath();
        // int result = myMath.sum(10,15)


        System.out.println("Сумма 10 и 15 = " + MyMath.sum(10,15));


        int radius = 10;

        double circleArea = Math.PI * radius * radius;

        System.out.println("Площадь круга с радиусом = " + radius + " будет равна : " + circleArea);


        System.out.println("Максимальное число из 10 и 25: " + Math.max(10,25));
    }
}
