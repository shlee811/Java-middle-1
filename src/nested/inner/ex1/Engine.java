package nested.inner.ex1;

public class Engine {
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }
    public void start() {
        System.out.println("충전 레벨 확인: " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");
    }
}


//엔진은 `Car` 클래스에서만 사용된다.
//엔진을 시작하기 위해서는 차의 충전 레벨과 차량의 이름이 필요하다.
//`Car` 인스턴스의 참조를 생성자에서 보관한다.
//엔진은 충전 레벨을 확인하기 위해 `Car.getChargeLevel()` 이 필요하다.
//엔진은 차량의 이름을 확인하기 위해 `Car.getModel()` 이 필요하다