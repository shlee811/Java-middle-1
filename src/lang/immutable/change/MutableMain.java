package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);
        //계산 이후 기존 값은 사라짐
        System.out.println("obj = " + obj.getValue());
    }
}


//`MutableObj` 을 `10` 이라는 값으로 생성한다. 이후에 `obj.add(20)` 을 통해서 `10 + 20` 을 수행한다.
//계산 이후에 기존에 있던 `10` 이라는 값은 사라진다.
//`MutableObj` 의 상태(값)가 `10` `30` 으로 변경되었다.
//`obj.getValue()` 를 호출하면 `30` 이 출력된다.

//불변 객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만들어서 반환하기 때문에 **꼭! 반환 값을 받아야 한다.**