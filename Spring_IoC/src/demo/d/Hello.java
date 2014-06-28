package demo.d;

/**
 * Created by Administrator on 14-6-28.
 */
public class Hello {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void sayHello() {
        System.out.println("hello, " + username);
    }
}
