package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        //NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        //NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        //NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        //NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();
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


//`error1` 이면 연결 실패가 발생한다. 2-1
//모든 곳에서 발생한 예외를 잡지 않았기 때문에 결과적으로 `main()` 밖으로 예외가 던져진다.
//`main()` 밖으로 예외가 던져지면 예외 메시지와 예외를 추적할 수 있는 스택 트레이스를 출력하고 프로그램을 종료한다.

//`error2` 이면 데이터 전송 실패이다.
//모든 곳에서 발생한 예외를 잡지 않았기 때문에 결과적으로 `main()` 밖으로 예외가 던져진다.
//`main()` 밖으로 예외가 던져지면 예외 메시지와 예외를 추적할 수 있는 스택 트레이스를 출력하고 프로그램을 종료한다.

//**남은 문제**
//예외 처리를 도입했지만, 아직 예외가 복구되지 않는다. 따라서 예외가 발생하면 발생하면 프로그램이 종료된다.
//사용 후에는 반드시 `disconnect()` 를 호출해서 연결을 해제해야 한다.

//해결된 문제** 2-2
//예외를 잡아서 처리했다. 따라서 예외가 복구 되고, 프로그램도 계속 수행할 수 있다.

//**남은 문제**
//예외 처리를 했지만 정상 흐름과 예외 흐름이 섞여 있어서 코드를 읽기 어렵다.
//사용 후에는 반드시 `disconnect()` 를 호출해서 연결을 해제해야 한다.


//**해결된 문제**  2-3
//자바의 예외 처리 메커니즘과 `try` , `catch` 구조 덕분에 정상 흐름은 `try` 블럭에 모아서 처리하고,
//예외 흐름은 `catch` 블럭에 별도로 모아서 처리할 수 있었다.
//덕분에 정상 흐름과 예외 흐름을 명확하게 분리해서 코드를 더 쉽게 읽을 수 있게 되었다.

//**남은 문제**
//사용 후에는 반드시 `disconnect()` 를 호출해서 연결을 해제해야 한다.

//앞서 이야기했듯이 외부 연결과 같은 자바 외부의 자원은 자동으로 해제가 되지 않는다.
//따라서 외부 자원을 사용한 후에는 연결을 해제해서 외부 자원을 반드시 반납해야 한다.
//예외가 발생해도 `disconnect()` 를 반드시 호출해서 연결을 해제하고 자원을 반납하려면 어떻게 해야할까?