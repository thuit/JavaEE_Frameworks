package demo.b;

/**
 * Created by Administrator on 14-6-28.
 */
public class Bussiness {
//    ?
    private DeviceWriter deviceWriter;

    public Bussiness(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void save() {
        deviceWriter.save2Device();
    }
}

//高层应用类不再依赖于底层模块类
//高层应用类依赖于接口（抽象的）

//底层模块类 不能 控制 高层应用类