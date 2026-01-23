package exception.ex3;
import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }
    public void connect() throws ConnectExceptionV3 {
        if (connectError) {
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }
    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패: " +
                    data);
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}


//```java
//예외는 별도의 패키지에 정의되어 있다. `import` 에 주의하자.
//오류 코드로 어떤 문제가 발생했는지 이해하는 것이 아니라 예외 그 자체로 어떤 오류가 발생했는지 알 수 있다.
//연결 관련 오류 발생하면 `ConnectExceptionV3` 를 던지고, 전송 관련 오류가 발생하면 `SendExceptionV3` 를 던진다.