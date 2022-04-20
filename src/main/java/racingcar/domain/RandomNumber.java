package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {
    private final static int MIN_NUMBER = 0;
    private final static int MAX_NUMBER = 9;

    public static int getRandomNumber() {
        int number = Randoms.pickNumberInRange(MIN_NUMBER,MAX_NUMBER);
        return number;
    }
}
