package JichengyuDuotai.Jicheng.duotai;

public class demo24 {
    public static void main(String[] args) {
        //创建笔记本
        demo24Computer computer = new demo24Computer();

        //开机
        computer.powerOn();

        //使用usb
        //准备一个鼠标使用
        //demo24mouth mouth = new demo24mouth();
        //首先向上转型 当做usb
        demo24USB usbMouse = new demo24mouth();
        //参数是usb类型 传递进去的就是usb鼠标
        computer.useDevice(usbMouse);

        //创建一个usb键盘
        //没有使用多态写法
        demo24keyboard keyboard = new demo24keyboard();
        computer.useDevice(keyboard);//正确写法 发生了向上转型
        computer.useDevice(new demo24keyboard());//也可以


        computer.powerOff();


    }

}
