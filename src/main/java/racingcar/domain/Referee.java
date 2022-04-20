package racingcar.domain;

public class Referee {

    public GoOrStop turnOver(int randomNumber, Car car) {
        if (randomNumber > 3) {
            moving(GoOrStop.GO, car);
            return GoOrStop.GO;
        }
        return GoOrStop.STOP;
    }

    private void moving(GoOrStop goOrStop, Car car) {
        if (goOrStop.isGo())
            car.goForward();
    }


}
