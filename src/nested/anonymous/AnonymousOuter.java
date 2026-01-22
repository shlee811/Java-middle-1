package nested.anonymous;
import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer()
        {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }


    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);

    }
}

//**익명 클래스 - 지역 클래스의 선언과 생성을 한번에**

//**new Printer() {body}**
//익명 클래스는 클래스의 본문(body)을 정의하면서 동시에 생성한다.
//`new` 다음에 바로 상속 받으면서 구현 할 부모 타입을 입력하면 된다.
//이 코드는 마치 인터페이스 `Printer` 를 생성하는 것 처럼 보인다.하지만 자바에서 인터페이스를 생성하는 것을 불가능하다.
// 이 코드는 인터페이스를 생성하는 것이 아니고, `Printer` 라는 이름의 인터페이스를 구현한 익명 클래스를 생성하는 것이다.
//`{body}` 부분에 `Printer` 인터페이스를 구현한 코드를 작성하면 된다. 이 부분이 바로 익명 클래스의 본문이 된다.
//쉽게 이야기해서 `Printer` 를 상속(구현) 하면서 바로 생성하는 것이다.