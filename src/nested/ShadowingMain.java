package nested;

public class ShadowingMain {
    public int value = 1;
    class Inner {
        public int value = 2;
        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMain.value = " +
                    ShadowingMain.this.value);
        }
    }
    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
//변수의 이름이 같기 때문에 어떤 변수를 먼저 사용할지 우선순위가 필요하다.
//프로그래밍에서 우선순위는 대부분 더 가깝꺼나, 더 구체적인 것이 우선권을 가진다. 쉽게 이야기해서 사람이 직관적으로 이해하기 쉬운 방향으로 우선순위를 설계한다.
//메서드 `go()` 의 경우 지역 변수인 `value` 가 가장 가깝다. 따라서 우선순위가 가장 높다.
//이렇게 다른 변수들을 가려서 보이지 않게 하는 것을 섀도잉(Shadowing)이라 한다.
//다른 변수를 가리더라도 인스턴스의 참조를 사용하면 외부 변수에 접근할 수 있다.
//`this.value` 는 내부 클래스의 인스턴스에 접근하고, `바깥클래스이름.this` 는 바깥 클래스의 인스턴스에 접근할 수있다.
//프로그래밍에서 가장 중요한 것은 명확성이다. 이렇게 이름이 같은 경우 처음부터 이름을 서로 다르게 지어서 명확하게구분하는 것이 더 나은 방법이다.