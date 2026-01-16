package enumeration.ex3;

public class EnumEx3_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        /*
            Grade myGrade = new Grade(); //enum 생성 불가
            double result = discountService.discount(myGrade, price);
            System.out.println("result price: " + result);
          */
    }
}


//```
//`enum` 은 열거형 내부에서 상수로 지정하는 것 외에 직접 생성이 불가능하다. 생성할 경우 컴파일 오류가 발생한다.
//오류 메시지: `enum classes may not be instantiated`