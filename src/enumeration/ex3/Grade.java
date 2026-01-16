package enumeration.ex3;

public enum Grade {
    BASIC, GOLD, DIAMOND
}


//열거형을 정의할 때는 `class` 대신에 `enum` 을 사용한다.
//원하는 상수의 이름을 나열하면 된다.
//앞서 직접 `ClassGrade` 를 구현할 때와는 비교가 되지 않을 정도로 편리하다.
//자바의 열거형으로 작성한 `Grade` 는 다음 코드와 거의 같다.
//열거형도 클래스이다.
//열거형은 자동으로 `java.lang.Enum` 을 상속 받는다.
//외부에서 임의로 생성할 수 없다.