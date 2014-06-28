package demo.d;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 14-6-28.
 */
@Component
public class Hello {

    @Autowired
    @Qualifier(value = "string")
    private String username;

    public void sayHello() {
        System.out.println("hello, " + username);
    }
}
