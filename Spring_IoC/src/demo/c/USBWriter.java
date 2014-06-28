package demo.c;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 14-6-28.
 */
@Component("u")//组件
public class USBWriter implements DeviceWriter {
    @Override
    public void save2Device() {
//        ...
        System.out.println("saved to USB...");
    }
}
