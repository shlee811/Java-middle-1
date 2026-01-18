package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);
            // 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}


//정적 중첩 클래스는 앞에 `static` 이 붙는다.
//정적 중첩 클래스는 자신의 멤버에는 당연히 접근할 수 있다.
//바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
//바깥 클래스의 클래스 멤버에는 접근할 수 있다.
//참고로 `NestedOuter.outClassValue` 를 `outClassValue` 와 같이 줄여서 사용해도 된다.
// 이 경우 바깥 클래스에 있는 필드를 찾아서 사용한다.

//**private 접근 제어자**
//`private` 접근 제어자는 같은 클래스 안에 있을 때만 접근할 수 있다.
//중첩 클래스도 바깥 클래스와 같은 클래스 안에 있다. 따라서 중첩 클래스는 바깥 클래스의 `private` 접근 제어자에 접근할 수 있다.