package exception.ex1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        client.disconnect();
    }
    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}


//프로그램에서 `return` 문을 제거하고 `if` 문으로 적절한 분기를 사용했다.
//`connect()` 에 성공해서 오류가 없는 경우에만 `send()` 를 호출한다.
//중간에 `return`하지 않으므로 마지막에 있는 `disconnect()`를 호출할 수 있다.
//연결에 실패해도 `disconnect()` 를 호출한다.
//데이터 전송에 실패해도 `disconnect()` 를 호출한다.

//**NetworkClient 사용시 주의 사항**
//`connect()` 가 실패한 경우 `send()` 를 호출하면 안된다. **해결**
//사용 후에는 반드시 `disconnect()` 를 호출해서 연결을 해제해야 한다. **해결**
//`connect()`,`send()` 호출에 오류가 있어도 `disconnect()` 는 반드시 호출해야 한다.

//정상 흐름과 예외 흐름
//그런데 반환 값으로 예외를 처리하는 `NetworkServiceV1_2` , `NetworkServiceV1_3` 와 같은 코드들을 보면
//정상 흐름과 예외 흐름이 전혀 분리되어 있지 않다. 어떤 부분이 정상 흐름이고 어떤 부분이 예외 흐름인지 이해하기가 너무 어렵다.
//심지어 예외 흐름을 처리하는 부분이 더 많다.