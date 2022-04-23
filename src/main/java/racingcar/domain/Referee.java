package racingcar.domain;

import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;

import java.util.ArrayList;
import java.util.List;

public class Referee {

    private Cars cars;
    private WinNames winNames;
    private Result result;

    public Referee(Cars cars) {
        this.cars = cars;
        this.winNames = new WinNames(new ArrayList<>());
        this.result = new Result(winNames);
    }
    public void turnOver(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            turnOver(cars.get(i), RandomNumber.generateRandomNumber());
        }
    }

    public void turnOver(Car car, int randomNumber) {
        if (randomNumber > 3) {
            moving(GoOrStop.GO, car);
        }
    }

    private void moving(GoOrStop goOrStop, Car car) {
        if (goOrStop.isGo())
            car.moveForward();
    }
}
