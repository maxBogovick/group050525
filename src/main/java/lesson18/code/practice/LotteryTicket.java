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

        // пройдемся по каждому номеру в билете и заполним его
        for (int i = 0; i < ticketNumbers.length; i++) {
            // нам необходимо обеспечить такой механизм заполнения, чтобы у нас не было повторяющихся номеров

            boolean isNotFillCurrentNumber = true;
            int currentRandomValue = 0;

            // до тех пор пока мы считаем, что текущий номер не заполнен делаем следующее:

            while (isNotFillCurrentNumber) {
                // получаем очередное значение для текущего номера билета
                currentRandomValue = source.receiveTicketNumber(isRandom, sizeLotteryNumbers, idTicket, i);

                // проверяем - а есть ли уже среди ранее введенных номеров такое значение
                // если "да" - то повторно запрашиваем номер
                // если "нет" - то сохраняем полученное значение в текущую ячейку массива и переходим к следующему

                if (isCurrentNumberNotRepeate(currentRandomValue)) {
                    ticketNumbers[i] = currentRandomValue;
                    isNotFillCurrentNumber = false;
                }
            }
        }
    }

    private boolean isCurrentNumberNotRepeate(int checkNumber) {
        for (int i = 0; i < ticketNumbers.length; i++) {
            if (ticketNumbers[i] == checkNumber) {
                return false;
            }
        }
        return true;
    }
}
