package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidationUtilsTest {

    @Test
    @DisplayName("String_split_테스트")
    void String_split_테스트() {
        String valueWithCommaDelimiter = "1,2";
        assertThat(new String[]{"1","2"}).contains(valueWithCommaDelimiter.split(","));
    }

    @Test
    @DisplayName("String_split_크기1인_Sting배열_테스트")
    void String_split_크기1인_Sting배열_테스트() {
        String value = "1";
        assertThat(new String[]{"1"}).containsExactly(value.split(","));
    }

    @Test
    @DisplayName("입력제한_글자수_위반시_IllegalArgumentException_검증")
    void 입력제한_글자수_위반시_IllegalArgumentException_검증() {
        assertThrows(IllegalArgumentException.class, () -> {
            ValidationUtils.nameValidator("abcde");
        });
    }

    @Test
    @DisplayName("자동차_이름_구분자_검증")
    void 자동차_이름_구분자_검증() {
        String[] names = "Kim,Park,Lee|Yong".split(",");
        assertThrows(IllegalArgumentException.class, () -> {
            ValidationUtils.delimiterValidator(names);
        });
    }

    @Test
    @DisplayName("n개의_자동차_이름_검증")
    void n개의_자동차_이름_검증() {
        String input = "Kim,Park,Lee|Yong";
        assertThrows(IllegalArgumentException.class, () -> {
            ValidationUtils.namesValidator(input);
        });
    }

    @Test
    @DisplayName("입력값에_괄호_포함_확인_테스트")
    void 입력값에_괄호_포함_확인_테스트() {
        String value = "(1,2)";
        int length = value.length();
        assertThat("1,2").isEqualTo(value.substring(1,length-1));
    }

}
