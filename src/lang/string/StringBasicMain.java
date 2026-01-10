package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}

//`String` 은 클래스다. `int` , `boolean` 같은 기본형이 아니라 참조형이다.
// 따라서 `str1` 변수에는 `String` 인스턴스의 참조값만 들어갈 수 있다.

//문자열은 매우 자주 사용된다. 그래서 편의상 쌍따옴표로 문자열을 감싸면 자바 언어에서 `new String("hello")`와 같이 변경해준다.
// (이 경우 실제로는 성능 최적화를 위해 문자열 풀을 사용하는데, 이 부분은 뒤에서 설명한다.)
//String str1 = "hello"; //기존
//String str1 = new String("hello"); //변경