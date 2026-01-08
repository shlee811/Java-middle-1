package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
//여러 변수가 하나의 객체를 참조하는 공유 참조를 막을 수 있는 방법은 없다.
// 그럼 공유 참조로 인해 발생하는 문제를 어떻게 해결할 수 있을까?
// 단순히 개발자가 공유 참조 문제가 발생하지 않도록 조심해서 코드를 작성해야 할까?