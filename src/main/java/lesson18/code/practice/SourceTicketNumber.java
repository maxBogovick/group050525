package lesson18.code.practice;

import lesson11.code.ifStatement.UserInputStatic;

import java.util.Random;

public class SourceTicketNumber {

    private Random random = new Random();

    public int receiveTicketNumber(boolean isRandom, int sizeLotteryNumber, int idTicket, int currentIndex){
        // данный метод будет возвращать очередной номер для заполнения нашего билета

        if (isRandom) {
            return receiveFromRandom(sizeLotteryNumber);
        } else {
            return receiveFromUserInput(idTicket, currentIndex);
        }
    }

    private int receiveFromUserInput(int idTicket, int currentIndex) {
        // данный метод будет возвращать значение, которое ввел пользователь

        return UserInputStatic.inputInt("Введите для билета № " + idTicket + " значение для числа № " + currentIndex + ": ");
    }

    private int receiveFromRandom(int sizeLotteryNumber) {
        // данный метод будет возвращать рандомное значение в диапазоне от 1 до sizeLotteryNumber

        return random.nextInt(1, sizeLotteryNumber + 1);
    }


}
