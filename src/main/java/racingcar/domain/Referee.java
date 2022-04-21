package racingcar.domain;

import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;

import java.util.Collections;
import java.util.List;

public class Referee {

    private Cars cars;

    public Referee(Cars cars) {
        this.cars = cars;
    }

    public void turnOver(List<Car> cars, List<Integer> randomNumbers) {
        for (int i = 0; i < cars.size(); i++) {
            turnOver(cars.get(i), randomNumbers.get(i));
        }
    }

    public GoOrStop turnOver(Car car, int randomNumber) {
        if (randomNumber > 3) {
            moving(GoOrStop.GO, car);
            return GoOrStop.GO;
        }
        return GoOrStop.STOP;
    }

    private void moving(GoOrStop goOrStop, Car car) {
        if (goOrStop.isGo())
            car.moveForward();
    }

    public String whoWin() {
        List<Car> sortedResult = sort();
        //TODO : 공동우승
        return sortedResult.get(0).getCarName().getName();
    }

    public List<Car> sort() {
        Collections.sort(cars.getCars(), (firstOne, secondOne)
                -> secondOne.getCarPosition().getPosition() - firstOne.getCarPosition().getPosition());
        return cars.getCars();
    }

}
