package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("문자열의 길이: " + str.length());
        System.out.println("문자열이 비어 있는지: " + str.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인지1: " + str.isBlank()); //Java 11
        System.out.println("문자열이 비어 있거나 공백인지2: " + " ".isBlank());
        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자: " + c);
    }
}


//`length()` : 문자열의 길이를 반환한다.
//`isEmpty()` : 문자열이 비어 있는지 확인한다. (길이가 0)
//`isBlank()` : 문자열이 비어 있는지 확인한다. (길이가 0이거나 공백(Whitespace)만 있는 경우), 자바 11
//`charAt(int index)` : 지정된 인덱스에 있는 문자를 반환한다.