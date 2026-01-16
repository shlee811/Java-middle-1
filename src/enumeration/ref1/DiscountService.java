package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}


//기존에 있던 `if` 문이 완전히 제거되고, 단순한 할인율 계산 로직만 남았다.
//기존에는 `if` 문을 통해서 회원의 등급을 찾고, 각 등급 별로 `discountPercent` 의 값을 지정했다.
//변경된 코드에서는 `if` 문을 사용할 이유가 없다. 단순히 회원 등급안에 있는 `getDiscountPercent()` 메서
//드를 호출하면 인수로 넘어온 회원 등급의 할인율을 바로 구할 수 있다.

