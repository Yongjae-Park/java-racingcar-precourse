package racingcar.utils;

public class ValidationUtils {
    private final static int MIN_LENGTH = 1;
    private final static int MAX_LENGTH = 5;
    private final static String DELIMITER = ",";

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
            throw new IllegalArgumentException("이름 길이제한 조건에 맞지 않습니다.");
    }
}
