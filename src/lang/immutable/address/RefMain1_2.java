package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //`a` 와 `b` 가 처음부터 서로 다른 인스턴스를 참조하면 된다.
        Address a = new Address("서울");
        Address b = new Address("서울");


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


//`a` 와 `b` 는 서로 다른 인스턴스를 참조한다. 따라서 `b` 가 참조하는 인스턴스의 값을 변경해도 `a` 에는 영향을 주지 않는다.