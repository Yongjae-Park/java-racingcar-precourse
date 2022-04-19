package racingcar.utils;

public class ValidationUtils {
    public static boolean nameValidator(String name) {
        return name.length() > 0 && name.length() <= 5;
    }
}
