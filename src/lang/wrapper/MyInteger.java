package lang.wrapper;

public class MyInteger {
    private final int value;
    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);       //숫자를 문자로 변경
    }
}

//`MyInteger` 는 `int value` 라는 단순한 기본형 변수를 하나 가지고 있다.
//그리고 이 기본형 변수를 편리하게 사용하도록 다양한 메서드를 제공한다.
//앞에서 본 `compareTo()` 메서드를 클래스 내부로 캡슐화 했다.
//이 클래스는 불변으로 설계했다.

///`MyInteger` 클래스는 단순한 데이터 조각인 `int` 를 내부에 품고, 메서드를 통해 다양한 기능을 추가했다. 덕분에 데
/// 이터 조각에 불과한 `int` 를 `MyInteger` 를 통해 객체로 다룰 수 있게 되었다.