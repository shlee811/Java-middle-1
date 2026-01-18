package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
    private class Engine {
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}



//엔진을 내부 클래스로 만들었다.
//`Engine.start()` 를 기존과 비교해보자.
//`Car` 의 인스턴스 변수인 `chargeLevel` 에 직접 접근할 수 있다.
//`Car` 의 인스턴스 변수인 `model` 에 직접 접근할 수 있다.

//**내부 클래스의 생성**
//바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때는 바깥 클래스 이름을 생략할 수 있다.
//예) `new Engine()`
//바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때 내부 클래스의 인스턴스는 자신을 생성한 바깥 클래스의 인스턴스를 자동으로 참조한다.
// 여기서 `new Engine()` `Car` 인스턴스를 자동으로 참조한다.