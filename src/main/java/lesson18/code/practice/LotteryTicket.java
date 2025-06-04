package lesson18.code.practice;

public class LotteryTicket {

    // массив для хранения номеров билета (мы не говорим какой он будет длины, чтобы иметь
    // возможность создать "универсальный" билет
    // то есть длину массива мы будет определять позже
    private int [] ticketNumbers;

    public int[] getTicketNumbers() {
        return ticketNumbers;
    }

    // основной метод для создания и заполнения билета
    public void createAndFillTicket(int sizeTicket, int sizeLotteryNumbers, boolean isRandom, int idTicket){
        ticketNumbers = new int[sizeTicket];
        fillTicket(sizeLotteryNumbers, isRandom, idTicket);
    }

    // метод для заполнения билета - передаем из какого диапазона должны быть значения в нем
    // каким образом эти значения появляются- рандомно или запрашиваем у пользователя

    private void fillTicket(int sizeLotteryNumbers, boolean isRandom, int idTicket) {
      // чтобы заполнить билет нам нужен ИСТОЧНИК значений

        SourceTicketNumber source = new SourceTicketNumber();

        for (int i = 0; i < ticketNumbers.length; i++) {
            // нам необходимо обеспечить такой механизм заполнения, чтобы у нас не было повторяющихся номеров

            ticketNumbers[i] = source.receiveTicketNumber(isRandom,sizeLotteryNumbers,idTicket,i);

        }
    }
}
