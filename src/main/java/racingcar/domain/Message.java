package racingcar.domain;

public enum Message {
    GET_CARS_NAME_MESSAGE("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)"),
    GET_TURN_MESSAGE("시도할 횟수"),
    ERROR_CAR_NAME_OVERSIZE_MESSAGE("[ERROR] 자동차 이름은 5자 이하만 가능합니다."),
    ERROR_TURN_INPUT_MESSAGE("[ERROR] 시도 횟수는 1이상 숫자만 가능합니다.");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
