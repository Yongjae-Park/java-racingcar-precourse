package racingcar.utils;

import racingcar.domain.Message;

public class ValidationUtils {
    private final static int MIN_LENGTH = 1;
    private final static int MAX_LENGTH = 5;
    private final static String DELIMITER = ",";
    private final static String TURN_VALUE_REGEX = "[1-9]+";

    public static void namesValidator(String input) {
        String[] names = input.split(DELIMITER);
        delimiterValidator(names);
    }

    public static void delimiterValidator(String[] names) {
        for(String name : names){
            nameValidator(name);
        }
    }

    public static void nameValidator(String name) {
        boolean isValidatedName = (name.length() <= MAX_LENGTH) && (name.length() >= MIN_LENGTH);
        if(!isValidatedName)
            throw new IllegalArgumentException(Message.ERROR_CAR_NAME_OVERSIZE_MESSAGE.getMessage());
    }

    public static boolean turnValueValidator(String turnValue) {
        return turnValue.matches(TURN_VALUE_REGEX);
    }
}
