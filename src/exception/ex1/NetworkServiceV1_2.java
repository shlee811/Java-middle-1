package exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }
        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }
        client.disconnect();
    }
    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}


//`NetworkService` 는 `NetworkClient` 를 사용하는 전체 흐름을 관리한다.
//오류가 발생한 경우 오류 코드를 출력으로 남긴다.
//오류가 발생한 경우 프로그램이 더 이상 진행되지 않도록 `return` 을 사용해서 중지한다.
//따라서 연결에 실패하면 데이터를 전송하는 문제가 해결된다.

//**NetworkClient 사용시 주의 사항**
//`connect()` 가 실패한 경우 `send()` 를 호출하면 안된다. **해결**
//사용 후에는 반드시 `disconnect()` 를 호출해서 연결을 해제해야 한다. **해결 안됨**

//`connect()`,`send()` 호출에 오류가 있어도 `disconnect()` 는 반드시 호출해야 한다.
//`connect()` 가 실패한 경우 `send()` 를 호출하면 안되는 부분은 해결되었다.
//하지만 사용 후에는 `disconnect()` 를 반드시 호출해야 하는 문제는 해결되지 않았다.
//`error2` 를 보면 데이터 전송에 실패하는 경우, 연결이 해제 되지 않는다.
// 계속 이렇게 두면 네트워크 연결 자원이 고갈될 수 있다.