package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        //기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; // a -> b, 값 복사 후 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

//기본형 변수 `a` 와 `b` 는 절대로 하나의 값을 공유하지 않는다.
//`b = a` 라고 하면 **자바는 항상 값을 복사해서 대입**한다.
