package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //-1
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}

//`findValue()` 는 배열에 찾는 값이 있으면 해당 값을 반환하고, **찾는 값이 없으면 `-1` 을 반환**한다.
//`findValue()` 는 결과로 `int` 를 반환한다. `int` 와 같은 기본형은 항상 값이 있어야 한다.
// 여기서도 값을 반환할 때 값을 찾지 못하면 숫자 중에 하나를 반환해야 하는데 보통 `-1` 또는 `0` 을 사용한다.
//실행 결과를 보면 입력값이 `-1` 일 때 `-1` 을 반환한다. 그런데 배열에 없는 값인 `100` 을 입력해도 같은 `-1` 을 반환한다.
//입력값이 `-1` 일 때를 생각해보면, 배열에 `-1` 값이 있어서 `-1` 을 반환한 것인지, 아니면 `-1` 값이 없어서 `-1` 을 반환한 것인지 명확하지 않다.