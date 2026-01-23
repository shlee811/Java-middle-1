package exception.ex2;

public class NetworkServiceV2_3 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect(); //예외 발생시 무시
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드:"+e.getErrorCode()+",메시지:"+e.getMessage());
            return;
        }

    }
}

//예외 처리 도입3 - 정상, 예외 흐름 분리
//이번에는 예외 처리의 `try ~ catch` 기능을 제대로 사용해서 정상 흐름과 예외 흐름이 섞여 있는 문제를 해결해보자
//하나의 `try` 안에 정상 흐름을 모두 담는다.
//그리고 예외 부분은 `catch` 블럭에서 해결한다.
//이렇게 하면 정상 흐름은 `try` 블럭에 들어가고, 예외 흐름은 `catch` 블럭으로 명확하게 분리할 수 있다.
