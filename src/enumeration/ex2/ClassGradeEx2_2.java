package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
       /* ClassGrade newClassGrade = new ClassGrade(); //생성자 private으로 막아야 함
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
        */
    }
}


//private` 생성자를 사용해서 외부에서 `ClassGrade` 를 임의로 생성하지 못하게 막았다.
//`private` 생성자 덕분에 `ClassGrade` 의 인스턴스를 생성하는 것은 `ClassGrade` 클래스 내부에서만 할 수있다.
// 앞서 우리가 정의한 상수들은 `ClassGrade` 클래스 내부에서 `ClassGrade` 객체를 생성한다.
//이제 `ClassGrade` 인스턴스를 사용할 때는 `ClassGrade` 내부에 정의한 상수를 사용해야 한다. 그렇지 않으면 컴파일 오류가 발생한다.
//쉽게 이야기해서 `ClassGrade` 타입에 값을 전달할 때는 우리가 앞서 열거한 `BASIC` , `GOLD` , `DIAMOND` 상수만 사용할 수 있다.