package lesson04.code.referenceType;

public class RobotDemoWithClass {
    public static void main(String[] args) {
        Robot petrovjch = new Robot();

        petrovjch.xCoordinate = 0;
        petrovjch.yCoordinate = 0;

        // запускаем робота и начинаем его движение

        // двигаем его вправо

        petrovjch.xCoordinate = petrovjch.xCoordinate + 1;


        System.out.println("Текущее положение робота: " +
                petrovjch.xCoordinate +
                " : " +
                petrovjch.yCoordinate);

        // двигаем робота вниз

        petrovjch.yCoordinate = petrovjch.yCoordinate - 1;


        System.out.println("Текущее положение робота: " +
                petrovjch.xCoordinate +
                " : " +
                petrovjch.yCoordinate);

        // двигаем его вправо

        petrovjch.xCoordinate = petrovjch.xCoordinate + 1;


        System.out.println("Текущее положение робота: " +
                petrovjch.xCoordinate +
                " : " +
                petrovjch.yCoordinate);

        // двигаем его влево вниз

        petrovjch.xCoordinate = petrovjch.xCoordinate - 1;
        petrovjch.yCoordinate = petrovjch.yCoordinate - 1;


        System.out.println("Текущее положение робота: " +
                petrovjch.xCoordinate +
                " : " +
                petrovjch.yCoordinate);


        // создадим второго робота

        Robot ivanich = new Robot();
        ivanich.xCoordinate = 10;
        ivanich.yCoordinate = 20;

        System.out.println("Текущее положение второго робота: " +
                ivanich.xCoordinate +
                " : " +
                ivanich.yCoordinate);


    }
}
