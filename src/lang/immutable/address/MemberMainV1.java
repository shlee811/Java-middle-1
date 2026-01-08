package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);
        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
        //회원B의 주소를 부산으로 변경해야함
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}

//`회원A` 와 `회원B` 는 둘다 서울에 살고 있다.
//중간에 `회원B` 의 주소를 부산으로 변경해야 한다.
//그런데 `회원A` 와 `회원B` 는 같은 `Address` 인스턴스를 참조하고 있다.
//`회원B` 의 주소를 부산으로 변경하는 순간 `회원A` 의 주소도 부산으로 변경된다.
//사이드 이펙트가 발생해서 회원B 뿐만 아니라 회원A의 주소도 부산으로 변경된다.