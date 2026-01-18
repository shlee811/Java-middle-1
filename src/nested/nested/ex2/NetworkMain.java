package nested.nested.ex2;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");
    }
}

//`Network` 관련 라이브러리를 사용하기 위해서 `ex2` 패키지를 열어본 개발자는 해당 클래스만 확인할 것이다.
// 추가로 `NetworkMessage` 가 중첩 클래스에 `private` 접근 제어자로 되어 있는 것을 보고,
// `Network` 내부에서만 단독으로 사용하는 클래스라고 바로 인지할 수 있다.
//<중첩 클래스의 접근>
//나의 클래스에 포함된 중첩 클래스가 아니라 다른 곳에 있는 중첩 클래스에 접근할 때는 `바깥클래스.중첩클래스` 로 접근해야 한다.
//나의 클래스에 포함된 중첩 클래스에 접근할 때는 바깥 클래스 이름을 적지 않아도 된다.
//중첩 클래스(내부 클래스 포함)는 그 용도가 자신이 소속된 바깥 클래스 안에서 사용되는 것이다. 따라서 자신이 소속된
//바깥 클래스가 아닌 외부에서 생성하고 사용하고 있다면, 이미 중첩 클래스의 용도에 맞지 않을 수 있다.
// 이때는 중첩 클래스를 밖으로 빼는 것이 더 나은 선택이다.