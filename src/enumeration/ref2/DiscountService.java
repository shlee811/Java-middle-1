package enumeration.ref2;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}

//이 코드를 보면 할인율 계산을 위해 `Grade` 가 가지고 있는 데이터인 `discountPercent` 의 값을 꺼내서 사용한다.
//결국 `Grade` 의 데이터인 `discountPercent` 를 할인율 계산에 사용한다.
//객체지향 관점에서 이렇게 자신의 데이터를 외부에 노출하는 것 보다는,
//`Grade` 클래스가 자신의 할인율을 어떻게 계산하는지 스스로 관리하는 것이 캡슐화 원칙에 더 맞다.
//`Grade` 클래스 안으로 `discount()` 메서드를 이동시키자. 일부 코드 수정이 필요하다.