package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();

        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}

//error1 입력**: 서버 연결에 실패한다.
//**error2 입력**: 데이터 전송에 실패한다.

//**남은 문제**
//연결이 실패하면 데이터를 전송하지 않아야 하는데, 여기서는 데이터를 전송한다.
//**추가 요구 사항**
//오류가 발생했을 때 어떤 오류가 발생했는지 자세한 내역을 남기면 이후 디버깅에 도움이 될 것이다. 오류 로그를 남겨야 한다.

//어떻게 하면 정상 흐름과 예외 흐름을 분리할 수 있을까? 지금과 같이 반환 값을 사용해서 예외 상황을 처리하는 방식으로는 해결할 수 없는 것은 확실하다.
//이런 문제를 해결하기 위해 바로 예외 처리 메커니즘이 존재한다. 지금부터 본격적으로 자바 예외 처리에 대해 알아보자.
//예외 처리를 사용하면 정상 흐름과 예외 흐름을 명확하게 분리할 수 있다