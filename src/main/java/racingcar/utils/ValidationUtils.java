package racingcar.utils;

public class ValidationUtils {
    private final static int MIN_LENGTH = 1;
    private final static int MAX_LENGTH = 5;

    public static void nameValidator(String name) {
        boolean isValidatedName = (name.length() <= MAX_LENGTH) && (name.length() >= MIN_LENGTH);
        if(!isValidatedName)
            throw new IllegalArgumentException("이름 길이제한 조건에 맞지 않습니다.");
    }

    public static void delimiterValidator(String[] names) {
        //전체 입력을 구분자(,)로 split했으니 names각 원소의 길이만 검증하면 된다.
        for(String name : names){
            nameValidator(name);
        }
    }
}
