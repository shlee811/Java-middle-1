package lang.object.poly;

public class ObjectPolyExample2
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); //Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};
        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}


//**size() 메서드**
//`size(Object[] objects)` 메서드는 배열에 담긴 객체의 수를 세는 역할을 담당한다.
//이 메서드는 `Object` 타입만 사용한다. `Object` 타입의 배열은 세상의 모든 객체를 담을 수 있기 때문에,
// 새로운 클래스가 추가되거나 변경되어도 이 메서드를 수정하지 않아도 된다.
// 지금 만든 `size()` 메서드는 자바를 사용하는 곳이라면 어디든지 사용될 수 있다.