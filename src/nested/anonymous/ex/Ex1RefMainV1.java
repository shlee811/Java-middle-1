package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        //코드 조각 시작
        process.run();
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Process {

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}

//프로그램 시작, 프로그램 종료를 출력하는 부분은 변하지 않는 부분이다.
//코드 조각을 시작하고 종료하는 부분은 변하는 부분이다.
//결국 코드 조각을 시작하고 종료하는 부분을 외부에서 전달 받아야 한다.
//이것은 단순히 문자열 같은 데이터를 전달 받는 것과는 차원이 다른 문제이다.

//**어떻게 외부에서 코드 조각을 전달할 수 있을까?**
//코드 조각은 보통 메서드(함수)에 정의한다. 따라서 코드 조각을 전달하기 위해서는 메서드가 필요하다.
//그런데 지금까지 학습한 내용으로는 메서드를 전달할 수 있는 방법이 없다. 대신에 인스턴스를 전달하고, 인스턴스에 있는 메서드를 호출하면 된다.
//이 문제를 해결하기 위해 인터페이스를 정의하고 구현 클래스를 만들었다.
//`Dice`,`Sum` 각각의 클래스는 `Process` 인터페이스를 구현하고 `run()` 메서드에 필요한 코드 조각을 구현한다.
//여기서는 정적 중첩 클래스를 사용했다. 물론 정적 중첩 클래스가 아니라 외부에 클래스를 직접 만들어도 된다.