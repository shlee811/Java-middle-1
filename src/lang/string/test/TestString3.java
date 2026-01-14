package lang.string.test;

public class TestString3 {
    public static void main(String[] args) {
        String str = "hello.txt";
        // 코드 작성
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);
    }
}

//`str` 에서 `".txt"` 문자열이 언제부터 시작하는지 위치를 찾아서 출력해라.
// `indexOf()` 를 사용해라.
//`indexOf(String ch)` / `indexOf(String ch, int fromIndex)` : 문자열이 처음 등장하는 위치를 반환한다.