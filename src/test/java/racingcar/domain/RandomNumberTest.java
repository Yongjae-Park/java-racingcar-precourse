package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {
    private final String RANDOM_REGEX = "[0-9]+";

    @Test
    @DisplayName("0-9사이_랜덤값_생성_테스트")
    void 랜덤값_범위내_생성_테스트() {
        int randomNumber = Randoms.pickNumberInRange(0,9);
        assertThat(String.valueOf(randomNumber).matches(RANDOM_REGEX)).isTrue();
    }

    @Test
    @DisplayName("참여자_수만큼_랜덤넘버_생성_테스트")
    void 참여자_수만큼_랜덤넘버_생성_테스트() {
        int carsSize = 5;
        List<Integer> randomNumbers = RandomNumber.generateRandomNumbers(carsSize);
        assertThat(randomNumbers.size()).isEqualTo(carsSize);
    }
}
