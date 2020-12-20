package JichengyuDuotai.Jicheng.jiekou;

public interface demo05MyInterfaceDefault {

    public abstract void methodAbs();

    //新添加的抽象方法  接口升级1个变成2个
    //public abstract void methodAbs2();

    //新添加的方法改为默认方法 public可以省略
    public default void methodDefault(){
        System.out.println("这是一个新添加的方法");
    }
}
