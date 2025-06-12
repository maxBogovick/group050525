package lesson19.code.practice.service;


import lesson19.code.practice.repository.LotteryRepository;

public class LotteryService {

    private LotteryRepository lotteryRepository = new LotteryRepository();

    public void prepareLottery() {
        lotteryRepository.makeLottery();
    }

    public void printResults(){
        // добавить вывод информации о результатах
        // продумать - это нужно делать здесь или где-то еще???

    }

}
