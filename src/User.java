import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    public String getName(){
        return name;
    }
}
