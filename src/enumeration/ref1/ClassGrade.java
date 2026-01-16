package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}


//`ClassGrade` 에 할인율(`discountPercent` ) 필드를 추가했다. 조회 메서드도 추가한다.
//생성자를 통해서만 `discountPercent` 를 설정하도록 했고, 중간에 이 값이 변하지 않도록 불변으로 설계했다.
//정리하면 상수를 정의할 때 각각의 등급에 따른 할인율(`discountPercent` )이 정해진다.