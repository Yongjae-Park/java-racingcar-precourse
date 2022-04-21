package racingcar.console;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Message;

public class Input {

    public static String getNames() {
        Output.printMessage(Message.GET_CARS_NAME_MESSAGE.getMessage());
        return Console.readLine();
    }

    public static int getTurn() {
        Output.printMessage(Message.GET_TURN_MESSAGE.getMessage());
        String turnValue = Console.readLine();
        return Integer.valueOf(turnValue);
    }
}
