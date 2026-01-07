package lang.object.equals;

public class UserV2
{
    private String id;

    public UserV2(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj)
    {
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }
}

//`UserV2` 는 `id` (고객번호)가 같으면 논리적으로 같은 객체로 정의하겠다.