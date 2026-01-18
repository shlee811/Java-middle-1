package nested.inner.ex2;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("Model Y", 100);
        myCar.start();
    }
}


//**리팩토링 전의 문제**
//`Car` 클래스는 엔진에 필요한 메서드들을 제공해야 한다. 다음 메서드는 엔진에서만 사용하고, 다른 곳에서는 사
//용하지 않는다.
//`getModel()`
//`getChargeLevel()`
//결과적으로 엔진에서만 사용하는 기능을 위해 메서드를 추가해서, 모델 이름과 충전 레벨을 외부에 노출해야 한
//다.
//리팩토링 전에는 결과적으로 모델 이름과 충전 레벨을 외부에 노출했다. 이것은 불필요한 `Car` 클래스의 정보들이 추가
//로 외부에 노출되는 것이기 때문에 캡슐화를 떨어뜨린다.
//리팩토링 후에는 `getModel()` , `getChargeLevel()` 과 같은 메서드를 모두 제거했다. 결과적으로 꼭 필요한 메서
//드만 외부에 노출함으로써 `Car` 의 캡슐화를 더 높일 수 있었다.