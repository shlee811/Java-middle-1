package enumeration.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}


//`grade.name()` 을 통해서 ENUM의 상수 이름을 사용할 수 있다.

