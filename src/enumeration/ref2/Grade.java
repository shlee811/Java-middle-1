package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);
    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}


//`discountPercent` 필드를 추가하고, 생성자를 통해서 필드에 값을 저장한다.
//열거형은 상수로 지정하는 것 외에 일반적인 방법으로 생성이 불가능하다.
// 따라서 생성자에 접근제어자를 선언 할 수 없게 막혀있다. `private` 이라고 생각하면 된다.
//`BASIC(10)`과 같이 상수 마지막에 괄호를 열고 생성자에 맞는 인수를 전달하면 적절한 생성자가 호출된다.
//값을 조회하기 위해 `getDiscountPercent()` 메서드를 추가했다. 열거형도 클래스이므로 메서드를 추가 할 수 있다.