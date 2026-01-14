package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = " Hello Java ";
        String trimmed = original.trim();
        System.out.println(trimmed);
    }
}


//문자의 양쪽 공백을 제거해라. 예) `" Hello Java "` `"Hello Java"`
//`trim()` : 문자열 양쪽 끝의 공백을 제거한다. 단순 `Whitespace` 만 제거할 수 있다.