package nested.local;
import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;       //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);   //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        //printer.print()를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();


        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}

//`process()`는 `Printer` 타입을 반환한다. 여기서는 `LocalPrinter` 인스턴스를 반환한다.
//여기서는 `LocalPrinter.print()` 메서드를 `process()` 안에서 실행하는 것이 아니라
//`process()` 메서드가 종료된 이후에 `main()` 메서드에서 실행한다.


//**지역 클래스 인스턴스의 생존 범위**
//지역 클래스로 만든 객체도 인스턴스이기 때문에 힙 영역에 존재한다. 따라서 GC 전까지 생존한다.
//`LocalPrinter` 인스턴스는 `process()` 메서드 안에서 생성된다. 그리고 `process()` 에서 `main()`
//으로 생성한 `LocalPrinter` 인스턴스를 반환하고 `printer` 변수에 참조를 보관한다.
// 따라서 `LocalPrinter` 인스턴스는 `main()` 이 종료될 때 까지 생존한다.
//`paramVar` , `localVar` 와 같은 지역 변수는 `process()` 메서드를 실행하는 동안에만 스택 영역에서 생존한다.
// `process()` 메서드가 종료되면 `process()` 스택 프레임이 스택 영역에서 제거 되면서 함께 제거된다.