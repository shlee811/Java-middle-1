package exception.ex2;

public class NetworkServiceV2_2 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드:"+e.getErrorCode()+",메시지:"+e.getMessage());
            return;
        }
        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드:"+e.getErrorCode()+",메시지:"+e.getMessage());
            return;
        }

        client.disconnect();
    }
}

//`connect()`,`send()` 와 같이 예외가 발생할 수 있는 곳을 `try ~ catch` 를 사용해서 `NetworkClientExceptionV2` 예외를 잡았다.
//여기서는 예외를 잡으면 오류 코드와 예외 메시지를 출력한다.
//예외를 잡아서 처리했기 때문에 이후에는 정상 흐름으로 복귀한다.
// 여기서는 리턴을 사용해서n `sendMessage()` 메서드를 정상적으로 빠져나간다.

