package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);
    }
}


//Object` 가 제공하는 `toString()` 메서드는 기본적으로 패키지를 포함한 객체의 이름과 객체의 참조값(해시코드)를 16진수로 제공한다.
//**참고**: 해시코드(`hashCode()`)에 대한 정확한 내용은 이후에 별도로 다룬다. 지금은 객체의 참조값 정도로 생각하면 된다.

//**println()과 toString()**
//그런데 `toString()` 의 결과를 출력한 코드와 `object` 를 `println()` 에 직접 출력한 코드의 결과가 완전히 같다.
//`System.out.println()` 메서드는 사실 내부에서 `toString()` 을 호출한다.
//`Object` 타입(자식 포함)이 `println()` 에 인수로 전달되면 내부에서 `obj.toString()` 메서드를 호출해서 결과를 출력한다.