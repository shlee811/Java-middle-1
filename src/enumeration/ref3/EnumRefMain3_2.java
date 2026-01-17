package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}


//각각의 등급별로 자신의 `discount()` 를 직접 호출하면 할인율을 구할 수 있다.
//`DiscountService` 를 제거해도 되지만, 앞의 예제에서 사용되므로 복습을 위해 남겨두자.