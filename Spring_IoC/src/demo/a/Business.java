package demo.a;

/**
 * Created by Administrator on 14-6-28.
 */
//高层应用类 调用了底层模块类
public class Business {//业务

    private FloppyWriter floppyWriter = new FloppyWriter();

    public void save() {
        floppyWriter.save2Floppy();
    }

//    private USBWriter usbWriter = new USBWriter();
//
//    public void save() {
//        usbWriter.save2USB();
//    }
}

//高层应用类依赖于底层模块类

//底层模块类 控制 高层应用类

//强耦合
//        解耦合
//松散耦合

