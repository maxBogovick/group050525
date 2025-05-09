package lesson04.code.referenceType;

public class RobotDemo {
    public static void main(String[] args) {

        int xCoordinate = 0;
        int yCoordinate = 0;

        // запускаем робота и начинаем его движение

        // двигаем его вправо

        xCoordinate = xCoordinate + 1;


        System.out.println("Текущее положение робота: " +
                xCoordinate +
                " : " +
                yCoordinate);

        // двигаем робота вниз

        yCoordinate = yCoordinate - 1;


        System.out.println("Текущее положение робота: " +
                xCoordinate +
                " : " +
                yCoordinate);

        // двигаем его вправо

        xCoordinate = xCoordinate + 1;


        System.out.println("Текущее положение робота: " +
                xCoordinate +
                " : " +
                yCoordinate);

        // двигаем его влево вниз

        xCoordinate = xCoordinate - 1;
        yCoordinate = yCoordinate - 1;


        System.out.println("Текущее положение робота: " +
                xCoordinate +
                " : " +
                yCoordinate);




        int xCoordinateRobot2 = 10;
        int yCoordinateRobot2 = 10;


        // если нам нужно будет одновременно давать команды на изменения координат нескольких
        // роботов, то мы модем запутаться и по ошибке изменить координаты не того робота




    }
}
