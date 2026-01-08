package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }
    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
    }
    public int getValue() {
        return value;
    }
}

//여기서 핵심은 `add()` 메서드이다.
//불변 객체는 값을 변경하면 안된다! 그러면 이미 불변 객체가 아니다!
//하지만 여기서는 기존 값에 새로운 값을 더해야 한다.
//불변 객체는 기존 값은 변경하지 않고 대신에 계산 결과를 바탕으로 새로운 객체를 만들어서 반환한다.
//이렇게 하면 불변도 유지하면서 새로운 결과도 만들 수 있다.