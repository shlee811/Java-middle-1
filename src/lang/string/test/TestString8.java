package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        String result = input.replace("java", "jvm");
        System.out.println(result);
    }
}

//`replace()` 를 사용해서 `java` 라는 단어를 `jvm`으로 변경해라.
//`replace(CharSequence target, CharSequence replacement)` : 특정 문자열을 새 문자열로 대체 한다.