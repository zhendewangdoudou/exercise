package JichengyuDuotai.Jicheng.jiekou;

public class demo05 {
    public static void main(String[] args) {
        demo05MyInterfaceDefaultImp a = new demo05MyInterfaceDefaultImp();

        a.methodAbs();//调用抽象方法
        a.methodDefault();//来自接口 实现类中没有

        demo05MyInterfaceDefaultImp1 b = new demo05MyInterfaceDefaultImp1();

        b.methodAbs();
        b.methodDefault();    }
}
