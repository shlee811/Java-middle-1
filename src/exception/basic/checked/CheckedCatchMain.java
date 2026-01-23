package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}


//`service.callCatch()` 에서 예외를 처리했기 때문에 `main()` 메서드까지 예외가 올라오지 않는다.
//`main()` 에서 출력하는 "정상 종료" 문구가 출력된 것을 확인할 수 있다.

//실행 순서를 분석해보자.
//1. `main()`-> `service.callCatch()`-> `client.call()`**[예외 발생, 던짐]**
//2. `main()` <-`service.callCatch()'-**[예외 처리]** <-`client.call()`
//3. `main()`**[정상 흐름]**<- `service.callCatch()` <-`client.call()`

//`Client.call()` 에서 `MyCheckedException` 예외가 발생하고, 그 예외를 `Service.callCatch()` 에서 잡는 것을 확인할 수 있다.