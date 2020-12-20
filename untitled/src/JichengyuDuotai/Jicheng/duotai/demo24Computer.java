package JichengyuDuotai.Jicheng.duotai;

public class demo24Computer {

    public void powerOn(){
        System.out.println("笔记本开机");
    }

    public void powerOff(){
        System.out.println("笔记本关机");
    }

    public void useDevice(demo24USB usb){
        usb.open();

        //usb.click();错的 需要向下转型
        if(usb instanceof demo24mouth){
            demo24mouth mouse = (demo24mouth) usb;
            mouse.click();
        }else if(usb instanceof demo24keyboard){
            demo24keyboard keyboard = (demo24keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }
}
