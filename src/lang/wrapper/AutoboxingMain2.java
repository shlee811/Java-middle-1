package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)
        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}

//오토 박싱과 오토 언박싱은 컴파일러가 개발자 대신 `valueOf`, `xxxValue()` 등의 코드를 추가해주는 기능이다.
//덕분에 기본형과 래퍼형을 서로 편리하게 변환할 수 있다.
//따라서 `AutoboxingMain1` 과 `AutoboxingMain2`는 동일하게 작동한다.
