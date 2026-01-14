package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}

//단순히 값을 누적해서 더하는 기능을 제공하는 클래스다.
//`add()` 메서드를 호출할 때 마다 내부의 `value` 에 값을 누적한다.
//`add()` 메서드를 보면 자기 자신(`this` )의 참조값을 반환한다. 이 부분을 유의해서 보자.