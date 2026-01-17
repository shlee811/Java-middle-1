package enumeration.ref3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}


//할인율 계산은 이제 `Grade` 가 스스로 처리한다.
// 따라서 `DiscountService.discount()` 메서드는 단순히 `Grade.discount()` 를 호출하기만 하면 된다.