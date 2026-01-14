package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed); // 출력: "avaJ olleH"
    }
}

//`StringBuilder` 에 있는 `reverse()` 를 사용해라.
//`reverse()` 메서드로 문자열을 뒤집는다.