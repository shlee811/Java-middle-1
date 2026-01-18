package time;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDt1 = " + plusDt1);

        LocalDateTime plusDt2 = dt.plusYears(10);
        System.out.println("plusDt2 = " + plusDt2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println("plusDt3 = " + plusDt3);
    }
}


//Temporal plus(long amountToAdd, TemporalUnit unit)**
//`LocalDateTime` 을 포함한 특정 시점의 시간을 제공하는 클래스는 모두 `Temporal` 인터페이스를 구현한다.
//`Temporal` 은 특정 시점의 시간을 조작하는 기능을 제공한다.
//`plus(long amountToAdd, TemporalUnit unit)` 를 호출할 때 더하기 할 숫자와 시간의 단위(Unit)를 전달하면 된다.
//이때 `TemporalUnit` 의 구현인 `ChronoUnit` 을 인수로 전달하면 된다.
//불변이므로 반환 값을 받아야 한다.
//참고로 `minus()`도 존재한다.

//**편의 메서드 사용**
//자주 사용하는 메서드는 편의 메서드가 제공된다.
//`dt.plus(10, ChronoUnit.YEARS)` `dt.plusYears(10)`
//**Period를 사용한 조작**
//`Period` 나 `Duration` 은 기간(시간의 간격)을 뜻한다. 특정 시점의 시간에 기간을 더할 수 있다.