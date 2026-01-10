package lang.string;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}

//`str1` 과 `str2` 는 `new String()` 을 사용해서 각각 인스턴스를 생성했다. 서로 다른 인스턴스이므로 동일성 (`==` ) 비교에 실패한다.
//둘은 내부에 같은 `"hello"` 값을 가지고 있기 때문에 논리적으로 같다. 따라서 동등성(`equals()` ) 비교에 성공한다.
// 참고로 `String` 클래스는 내부 문자열 값을 비교하도록 `equals()` 메서드를 재정의 해두었다.

//`String str3 = "hello"` 와 같이 문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
//자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 `String` 인스턴스를 미리 만들어둔다.
//이때 같은 문자열이 있으면 만들지 않는다.

//`String str3 = "hello"` 와 같이 문자열 리터럴을 사용하면 문자열 풀에서 `"hello"` 라는 문자를 가진 `String` 인스턴스를 찾는다.
// 그리고 찾은 인스턴스의 참조(`x003` )를 반환한다.
//`String str4 = "hello"` 의 경우 `"hello"` 문자열 리터럴을 사용하므로 문자열 풀에서 `str3` 과 같은 `x003` 참조를 사용한다.
//문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능도 최적화 할 수 있다.

//따라서 문자열 리터럴을 사용하는 경우 같은 참조값을 가지므로 `==` 비교에 성공한다.