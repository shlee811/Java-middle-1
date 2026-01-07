package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj) {
        String string =
                "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }
}


///ObjectPrinter` 는 모든 타입의 부모인 `Object` 를 사용하고, `Object` 가 제공하는 `toString()` 메서드만 사용한다.
//따라서 `ObjectPrinter` 를 사용하면 세상의 모든 객체의 정보(`toString()` )를 편리하게 출력할 수 있다.