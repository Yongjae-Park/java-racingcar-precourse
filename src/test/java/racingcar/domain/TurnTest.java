package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    @DisplayName("턴횟수_입력값_검증")
    void 턴횟수_입력값_검증() {
        assertThat(Turn.turnValueValidator(0)).isFalse();
        assertThat(Turn.turnValueValidator(1)).isTrue();
        assertThat(Turn.turnValueValidator(-1)).isFalse();
    }
}
