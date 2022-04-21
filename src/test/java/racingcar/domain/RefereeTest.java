package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarGenerator;
import racingcar.domain.car.Cars;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RefereeTest {
    private Referee referee;
    private final int GO_RANGE_NUMBER = 5;
    private final int STOP_RANGE_NUMBER = 2;
    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars(CarGenerator.registerCars("Park,Yong,Jun"));
        referee = new Referee(cars);
    }

    @Test
    @DisplayName("앞으로_한발짝_테스트")
    void goForward() {
        int randomNumber = GO_RANGE_NUMBER;
        Car car = new Car("Jin");
        assertThat(referee.turnOver(car, randomNumber)).isEqualTo(GoOrStop.GO);
        assertThat(car.getCarPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("정지_테스트")
    void stop() {
        int randomNumber = STOP_RANGE_NUMBER;
        Car car = new Car("Park");
        assertThat(referee.turnOver(car, randomNumber)).isEqualTo(GoOrStop.STOP);
        assertThat(car.getCarPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("한번의턴_단일_우승_테스트")
    void turnOverTest() {
        List<Integer> randomNumbers = Arrays.asList(2, 3, 4);
        referee.turnOver(cars.getCars(), randomNumbers);
        assertThat(referee.whoWin()).isEqualTo("Jun");
    }

    @Test
    @DisplayName("한번의턴_공동_우승_테스트")
    void turnOverTest_공동우승() {
       //TODO : 공동우승 테스트
    }
}
