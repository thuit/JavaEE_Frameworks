package demo.b;


/**
 * Created by Administrator on 14-6-28.
 */
public class Test {
    public static void main(String[] args) {
//        Bussiness bussiness = new Bussiness(new FloppyWriter());
        Bussiness bussiness = new Bussiness(new USBWriter());
        bussiness.save();
    }
}
