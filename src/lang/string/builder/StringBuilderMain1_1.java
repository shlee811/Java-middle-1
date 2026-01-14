package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        //`StringBuilder` 객체를 생성한다.
        StringBuilder sb = new StringBuilder();
        //`append()` 메서드를 사용해 여러 문자열을 추가한다.
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);
        //`insert()` 메서드로 특정 위치에 문자열을 삽입한다.
        sb.insert(4, "Java");
        System.out.println("insert = " + sb);
        //`delete` () 메서드로 특정 범위의 문자열을 삭제한다.
        sb.delete(4, 8);
        System.out.println("delete = " + sb);
        //`reverse()` 메서드로 문자열을 뒤집는다.
        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
//마지막으로 `toString` 메소드를 사용해 `StringBuilder` 의 결과를 기반으로 `String` 을 생성해서 반환한다.





