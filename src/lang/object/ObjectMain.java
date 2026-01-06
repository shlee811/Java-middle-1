package lang.object;

public class ObjectMain
{
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);
    }
}


//`Parent` 는 `Object` 를 묵시적으로 상속 받았기 때문에 메모리에도 함께 생성된다.
//1. `child.toString()` 을 호출한다.
//2.먼저 본인의 타입인 `Child` 에서 `toString()` 을 찾는다. 없으므로 부모 타입으로 올라가서 찾는다.
//3.부모 타입인 `Parent` 에서 찾는다. 없으므로 부모 타입으로 올라가서 찾는다.
//4.부모 타입인 `Object` 에서 찾는다. `Object` 에 `toString()` 이 있으므로 이 메서드를 호출한다.

//**정리**
//자바에서 모든 객체의 최종 부모는 `Object`다.