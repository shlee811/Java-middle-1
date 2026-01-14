package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        //분리하기
        String[] splitFruits = fruits.split(",");
        for(String fruit : splitFruits) {
            System.out.println(fruit);
        }
        //합치기
        String joinedString = String.join("->", splitFruits);
        System.out.println("joinedString = " + joinedString);
    }
}

//`split()` 를 사용해서 `fruits` 를 분리하고, `join()` 을 사용해서 분리한 문자들을 하나로 합쳐라.
//`split(String regex)` : 문자열을 정규 표현식을 기준으로 분할한다.
//`join(CharSequence delimiter, CharSequence... elements)` : 주어진 구분자로 여러 문자열을 결합한다.