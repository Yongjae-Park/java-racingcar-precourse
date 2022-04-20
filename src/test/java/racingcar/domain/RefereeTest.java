package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RefereeTest {
    private Referee referee;
    private final int GO_RANGE_NUMBER = 5;
    private final int STOP_RANGE_NUMBER = 2;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @Test
    @DisplayName("앞으로_한발짝_테스트")
    void goForward() {
        int randomNumber = GO_RANGE_NUMBER;
        Car car = new Car("Jin");
        assertThat(referee.turnOver(randomNumber, car)).isEqualTo(GoOrStop.GO);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("정지_테스트")
    void stop() {
        int randomNumber = STOP_RANGE_NUMBER;
        Car car = new Car("Park");
        assertThat(referee.turnOver(randomNumber, car)).isEqualTo(GoOrStop.STOP);
        assertThat(car.getPosition()).isEqualTo(0);
    }

}
