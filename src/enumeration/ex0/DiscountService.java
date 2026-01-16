package enumeration.ex0;

public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;
        if (grade.equals("BASIC")) {
            discountPercent = 10;
        } else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        return price * discountPercent / 100;
    }
}

//price * discountPercent / 100` : `가격 * 할인율 / 100` 을 계산하면 할인 금액을 구할 수 있다.
//회원 등급 외 다른 값이 입력되면 `할인X` 를 출력한다. 이 경우 `discountPercent` 가 `0` 이므로 할인 금액도 `0`원으로 계산된다.
//예제를 단순화하기 위해 회원 등급에 `null` 은 입력되지 않는다고 가정한다.