package lang.object.poly;

public class ObjectPolyExample1
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); //컴파일 오류, Object는 sound()가 없다.
        //obj.move(); //컴파일 오류, Object는 move()가 없다.

        //객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }

}

//**Object를 활용한 다형성의 한계**
//`Object` 는 모든 객체를 대상으로 다형적 참조를 할 수 있다.
//쉽게 이야기해서 `Object` 는 모든 객체의 부모이므로 모든 객체를 담을 수 있다.
//`Object` 를 통해 전달 받은 객체를 호출하려면 각 객체에 맞는 다운캐스팅 과정이 필요하다.
//`Object` 가 세상의 모든 메서드를 알고 있는 것이 아니다.