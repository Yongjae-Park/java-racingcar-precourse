package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumber {
    private final static int MIN_NUMBER = 0;
    private final static int MAX_NUMBER = 9;
    private final static List<Integer> randomNumbers = new ArrayList<>();

    public static List<Integer> generateRandomNumbers(int carsSize) {
        for (int i = 0 ; i < carsSize ; i++) {
            randomNumbers.add(getRandomNumber());
        }
        return randomNumbers;
    }

    private static int getRandomNumber() {
        int number = Randoms.pickNumberInRange(MIN_NUMBER,MAX_NUMBER);
        return number;
    }
}
