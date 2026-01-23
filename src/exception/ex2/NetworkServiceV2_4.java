package exception.ex2;

public class NetworkServiceV2_4 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
        client.disconnect();
    }
}

//이 코드를 보면 예외 처리가 끝난 다음에 정상 흐름의 마지막에 `client.disconnect()` 를 호출했다.
//이렇게 하면 예외가 모두 처리되었기 때문에 `client.disconnect()` 가 항상 호출될 것 같다.
//코드를 실행해보면 오류가 발생해도 서버 연결 해제에 성공하는 것을 확인할 수 있다.

//**하지만 지금과 같은 방식에는 큰 문제가 있다.**
//바로 `catch` 에서 잡을 수 없는 예외가 발생할 때이다.

//사용 후에 반드시 `disconnect()` 를 호출해서 연결 해제를 보장하는 것은 쉽지 않다.
//왜냐하면 정상적인 상황, 예외 상황 그리고 어디선가 모르는 예외를 밖으로 던지는 상황까지 모든 것을 고려해야 한다.
//하지만 앞서 보았듯이 지금과 같은 구조로는 항상 `disconnect()` 와 같은 코드를 호출하는 것이 매우 어렵고 실수로 놓칠 가능성이 높다.
//결국 새로운 대안이 필요하다