package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;
        public void print() {
        // 자신의 멤버에 접근
            System.out.println(innerInstanceValue);
        // 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceValue);
        // 외부 클래스의 클래스 멤버에는 접근 가능. private도 접근 가능
            System.out.println(InnerOuter.outClassValue);
        }
    }
}


//내부 클래스는 앞에 `static` 이 붙지 않는다. 쉽게 이야기해서 인스턴스 멤버가 된다.
//내부 클래스는 자신의 멤버에는 당연히 접근할 수 있다.
//바깥 클래스의 인스턴스 멤버에 접근할 수 있다.
//바깥 클래스의 클래스 멤버에 접근할 수 있다.

//**private 접근 제어자**
//`private` 접근 제어자는 같은 클래스 안에 있을 때만 접근할 수 있다.
//내부 클래스도 바깥 클래스와 같은 클래스 안에 있다. 따라서 내부 클래스는 바깥 클래스의 `private` 접근 제어자에 접근할 수 있다.