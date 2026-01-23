package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}


//`Service.callThrow()`안에서 예외를 처리하지 않고, 밖으로 던졌기 때문에 예외가 `main()` 메서드까지 올라온다.
//`main()` 의 `service.callThrow()` 를 호출하는 곳에서 예외를 잡아서 처리하지 못했기 때문에 여기서 예외가 `main()` 밖으로 던져진다.
//따라서 `main()` 에 있는 `service.callThrow()` 메서드 다음에 있는 "정상종료"가 출력되지 않는다.
//예외가 `main()` 밖으로 던져지면 예외 정보와 스택 트레이스(Stack Trace)를 출력하고 프로그램이 종료된다.
//스택 트레이스 정보를 활용하면 예외가 어디서 발생했는지, 그리고 어떤 경로를 거쳐서 넘어왔는지 확인 할 수 있다.

//실행 순서를 분석해보자.
//1. `main()`=> `service.callThrow()`=> `client.call()` **[예외 발생, 던짐]**
//2. `main()`<= `service.callThrow()` **[예외 던짐]** <=`client.call()`
//3. `main()` **[예외 던짐]** <=`service.callThrow()`<= `client.call()`