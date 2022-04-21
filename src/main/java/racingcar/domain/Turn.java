package racingcar.domain;

public class Turn {
    private final int ZERO_BASE = 0;
    private int turnValue;
    private int currentTurn;

    public Turn(int turnValue) {
        turnValueValidator(turnValue);
        this.turnValue = turnValue;
        this.currentTurn = ZERO_BASE;
    }

    public static boolean turnValueValidator(int turnValue) {
        return turnValue >= 1;
    }

    public boolean isOver() {
        currentTurn++;
        return currentTurn >= turnValue;
    }

    public int getTurnValue() {
        return turnValue;
    }
}
