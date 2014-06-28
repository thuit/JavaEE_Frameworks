package demo.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 14-6-28.
 */
@Component
public class Business {
//    ?
    @Autowired//自动装配
    @Qualifier(value = "u")
    private DeviceWriter deviceWriter;

    public void save() {
        deviceWriter.save2Device();//NPE
    }
}

//高层应用类不再依赖于底层模块类
//高层应用类依赖于接口（抽象的）

//底层模块类 不能 控制 高层应用类