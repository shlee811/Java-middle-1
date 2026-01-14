package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);
        int result = adder3.getValue();
        System.out.println("result = " + result);
    }
}
//메서드 호출의 결과로 자기 자신의 참조값을 반환하면, 반환된 참조값을 사용해서 메서드 호출을 계속 이어갈 수 있다.
//코드를 보면 `.` 을 찍고 메서드를 계속 연결해서 사용한다. 마치 메서드가 체인으로 연결된 것 처럼 보인다.
// 이러한 기법을 메서드 체이닝이라 한다.
//기존에는 메서드를 호출할 때 마다 계속 변수명에 `.` 을 찍어야 했다. 예) `adder.add(1)` ,`adder.add(2)`
//메서드 체이닝 방식은 메서드가 끝나는 시점에 바로 `.` 을 찍어서 변수명을 생략할 수 있다.
//메서드 체이닝이 가능한 이유는 자기 자신의 참조값을 반환하기 때문이다. 이 참조값에 `.` 을 찍어서 바로 자신의 메서드를 호출할 수 있다.
//**메서드 체이닝 기법은 코드를 간결하고 읽기 쉽게 만들어준다.**