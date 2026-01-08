package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b.setValue("부산");             //b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}
//참조형 변수들은 같은 참조값을 통해 같은 인스턴스를 참조할 수 있다.
//`b = a` 라고 하면 `a` 에 있는 참조값 `x001` 을 복사해서 `b` 에 전달한다.
//자바에서 모든 값 대입은 변수가 가지고 있는 값을 복사해서 전달한다.
//변수가 `int` 같은 숫자값을 가지고 있으면 숫자값을 복사해서 전달하고,참조값을 가지고 있으면 참조값을 복사해서 전달한다.
//참조값을 복사해서 전달하므로 결과적으로 `a` , `b` 는 같은 `x001` 인스턴스를 참조한다.
//기본형 변수는 절대로 같은 값을 공유하지 않는다.
//예) `a=10` , `b=10` 과 같이 같은 모양의 숫자 `10` 이라는 값을 가질 수는 있지만 같은 값을 공유하는 것은 아니다.
// 서로 다른 숫자 `10` 이 두 개 있는 것이다.
//참조형 변수는 참조값을 통해 같은 객체(인스턴스)를 공유할 수 있다.