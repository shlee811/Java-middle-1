package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        // 코드 작성
        boolean result = url.startsWith("https://");
        System.out.println(result); // 출력: true
    }
}

//`startsWith()` 를 사용해서 `url` 이 `https://` 로 시작하는지 확인해라.
//`startsWith(String prefix)`: 문자열이 특정 접두사로 시작하는지 확인한다.