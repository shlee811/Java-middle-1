package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //-1
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}

//앞서 만든 `MyInteger` 래퍼 클래스를 사용했다.
//실행 결과를 보면 `-1` 을 입력했을 때는 `-1` 을 반환한다.
//`100` 을 입력했을 때는 값이 없다는 `null` 을 반환한다.

//기본형은 항상 값이 존재해야 한다. 숫자의 경우 `0` , `-1` 같은 값이라도 항상 존재해야 한다.
// 반면에 객체인 참조형은 값이 없다는 `null` 을 사용할 수 있다. 물론 `null` 값을 반환하는 경우
// 잘못하면 `NullPointerException` 이 발생 할 수 있기 때문에 주의해서 사용해야 한다.