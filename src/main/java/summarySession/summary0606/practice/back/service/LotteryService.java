package summarySession.summary0606.practice.back.service;


import summarySession.summary0606.practice.back.repository.LotteryRepository;

public class LotteryService {

    private LotteryRepository lotteryRepository;

    public LotteryService(LotteryRepository lotteryRepository) {
        this.lotteryRepository = lotteryRepository;
    }

    public void prepareLottery() {
        lotteryRepository.makeLottery();
    }

    public int[] returnWinnerNumbers(){
        return lotteryRepository.getWinningNumbers();
    }


}
