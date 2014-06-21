package demo.action;

/**
 * Created by Administrator on 14-6-21.
 */
public class SignupAction {
    private String username;
    private String password;

    public String execute() {
        System.out.println(username + ", " + password);
//        DB...
        return "success";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
