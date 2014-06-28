package demo.b;

/**
 * Created by Administrator on 14-6-28.
 */
public class USBWriter implements DeviceWriter {
    @Override
    public void save2Device() {
//        ...
        System.out.println("saved to USB...");
    }
}
