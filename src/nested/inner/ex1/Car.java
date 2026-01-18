package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }
    //Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }
    //Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}


//`Car` 클래스는 엔진에 필요한 메서드들을 제공해야 한다. 다음 메서드는 엔진에서만 사용하고, 다른 곳에서는 사용하지 않는다.
//`getModel()`
//`getChargeLevel()`
//결과적으로 `Car` 클래스는 엔진에서만 사용하는 기능을 위해 메서드를 추가해서, 모델 이름과 충전 레벨을 외부에 노출해야 한다.