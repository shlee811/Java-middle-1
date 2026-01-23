package exception.basic.checked;

public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message);
    }
}


//예외 클래스를 만들려면 예외를 상속 받으면 된다.
//`Exception` 을 상속받은 예외는 체크 예외가 된다.

//**Exception을 상속받은 예외는 체크 예외가 된다.**
//`MyCheckedException` 는 `Exception` 을 상속받았다. `Exception` 을 상속받으면 체크 예외가 된다.
//참고로 `RuntimeException` 을 상속받으면 언체크 예외가 된다. 이런 규칙은 자바 언어에서 문법으로 정한 것이다.
//예외가 제공하는 기본 기능이 있는데, 그 중에 오류 메시지를 보관하는 기능도 있다. 예제에서 보는 것 처럼 생성
//자를 통해서 해당 기능을 그대로 사용하면 편리하다.

//`super(message)`로 전달한 메시지는 `Throwable` 에 있는 `detailMessage` 에 보관된다.
//`getMessage()` 를 통해 조회할 수 있다.