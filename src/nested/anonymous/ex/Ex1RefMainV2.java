package nested.anonymous.ex;

import java.util.Random;
//지역 클래스 사용
public class Ex1RefMainV2 {public static void hello(Process process) {
    System.out.println("프로그램 시작");
//코드 조각 시작
    process.run();
//코드 조각 종료
    System.out.println("프로그램 종료");
}
    public static void main(String[] args) {
        class Dice implements Process {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }
        class Sum implements Process {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        Process dice = new Dice();
        Process sum = new Sum();
        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}


//이번에는 지역 클래스를 사용해서 같은 기능을 구현해보자.
//실행 결과는 기존과 같다. 이해하는데 어려움은 없을 것이다.