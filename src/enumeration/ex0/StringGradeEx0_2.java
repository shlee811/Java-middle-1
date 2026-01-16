package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);
        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);
        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
}

//예제에서는 다음과 같은 문제가 발생했다.
//존재하지 않는 VIP라는 등급을 입력했다.
//오타: DIAMOND 마지막에 D가 하나 추가되었다.
//소문자 입력: 등급은 모두 대문자인데, 소문자를 입력했다.
//등급에 문자열을 사용하는 지금의 방식은 다음과 같은 문제가 있다.

//**타입 안정성 부족**: 문자열은 오타가 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있다.
//**데이터 일관성**: "GOLD", "gold", "Gold" 등 다양한 형식으로 문자열을 입력할 수 있어 일관성이 떨어진다.

//**String 사용 시 타입 안정성 부족 문제**
//-*값의 제한 부족**: `String`으로 상태나 카테고리를 표현하면, 잘못된 문자열을 실수로 입력할 가능성이 있다.
//예를들어, "Monday", "Tuesday" 등을 나타내는 데 `String` 을 사용한다면, 오타("Munday")나 잘못된 값("Funday")이 입력될 위험이 있다.
//-**컴파일 시 오류 감지 불가**: 이러한 잘못된 값은 컴파일 시에는 감지되지 않고, 런타임에서만 문제가 발견되기 때문에 디버깅이 어려워질 수 있다.

//이런 문제를 해결하려면 특정 범위로 값을 제한해야 한다. 예를 들어 `BASIC` , `GOLD` , `DIAMOND` 라는 정확한 문자만 `discount()` 메서드에 전달되어야 한다.
//하지만 `String` 은 어떤 문자열이든 받을 수 있기 때문에 자바 문법 관점에서는 아무런 문제가 없다. 결국 `String` 타입을 사용해서는 문제를 해결할 수 없다.