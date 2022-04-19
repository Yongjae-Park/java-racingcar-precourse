package racingcar.utils;

public class ValidationUtils {
    private final static int MIN_LENGTH = 1;
    private final static int MAX_LENGTH = 5;
    public static boolean nameValidator(String name) {
        boolean isValidatedName = (name.length() <= MAX_LENGTH) && (name.length() >= MIN_LENGTH);
        if(!isValidatedName)
            throw new IllegalArgumentException("이름 길이제한 조건에 맞지 않습니다.");
        return isValidatedName;
    }
}
