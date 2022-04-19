package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
    @DisplayName("자동차_이름_입력값_크기_검증")
    void 자동차_이름_입력값_크기_검증() {
        assertThat(ValidationUtils.nameValidator("abcdef")).isFalse();
        assertThat(ValidationUtils.nameValidator("James")).isTrue();
        assertThat(ValidationUtils.nameValidator("")).isFalse();
    }
}
