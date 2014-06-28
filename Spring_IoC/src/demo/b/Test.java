package demo.b;


/**
 * Created by Administrator on 14-6-28.
 */
public class Test {
    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());
//        Business business = new Business(new USBWriter());

        Business business = new Business();
        business.setDeviceWriter(new USBWriter());
        business.save();
    }
}
