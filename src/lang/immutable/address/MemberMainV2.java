package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);
        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
        //회원B의 주소를 부산으로 변경해야함
        //memberB.getAddress().setValue("부산"); //컴파일 오류
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}

//`회원B` 의 주소를 중간에 부산으로 변경하려고 시도한다. 하지만 `ImmutableAddress` 에는 값을 변경할 수 있는 메서드가 없다.
//따라서 컴파일 오류가 발생한다.
//결국 `memberB.setAddress(new ImmutableAddress("부산"))` 와 같이 새로운 주소 객체를 만들어서 전달한다.