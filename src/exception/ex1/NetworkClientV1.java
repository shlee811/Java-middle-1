package exception.ex1;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }
    public String connect() {
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }
    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
            return "sendError";
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
            if (data.contains("error2")) {
                sendError = true;
            }
        }
    }
}


//NetworkClientV1` 에는 `connectError` , `sendError` 필드가 있다.
//`connectError` : 이 필드의 값이 `true` 가 되면 연결에 실패하고, `connectError` 오류 코드를 반환한다.
//`sendError` : 이 필드의 값이 `true` 가 되면 데이터 전송에 실패한다. `sendError` 오류 코드를 반환한다.
//문제가 없으면 `success` 코드를 반환한다.

//`initError(String data)`
//이 메서드를 통해서 `connectError` , `sendError` 필드의 값을 `true`로 설정할 수 있다.
//사용자 입력 값에 "error1"이 있으면 `connectError` 오류가 발생하고, "error2"가 있으면 `sendError`오류가 발생한다.