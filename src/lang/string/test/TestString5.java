package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // 코드 작성
        int extIndex = str.indexOf(ext);
        String filename = str.substring(0, extIndex);
        String extName = str.substring(extIndex);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}

//`str` 에는 파일의 이름과 확장자가 주어진다. `ext` 에는 파일의 확장자가 주어진다.
//파일명과 확장자를 분리해서 출력하라.
//`indexOf()` 와 `substring()` 을 사용
//`indexOf(String ch)` / `indexOf(String ch, int fromIndex)` : 문자열이 처음 등장하는 위치를 반환한다.
//`substring(int beginIndex)` / `substring(int beginIndex, int endIndex)` : 문자열의 부분 문자열을 반환한다.
