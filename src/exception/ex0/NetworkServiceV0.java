package exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}


//`NetworkService` 는 복잡한 `NetworkClient` 사용 로직을 처리한다.
//`NetworkClient` 를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달한다.
//`NetworkClient` 를 사용하는데 필요한 `connect()` , `send(data)` , `disconnect()` 를 순서대로 호출한다.