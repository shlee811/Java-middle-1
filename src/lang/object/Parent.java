package lang.object;

//extends Object 추가
public class Parent extends Object {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}

//부모가 없으면 묵시적으로 Object 클래스를 상속받는다.