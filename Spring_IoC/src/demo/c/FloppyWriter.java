package demo.c;

/**
 * Created by Administrator on 14-6-28.
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void save2Device() {
//        ...
        System.out.println("saved to floppy...");
    }
}
