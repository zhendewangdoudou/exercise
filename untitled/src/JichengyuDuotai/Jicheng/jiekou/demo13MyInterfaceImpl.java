package JichengyuDuotai.Jicheng.jiekou;

public class demo13MyInterfaceImpl implements demo13MyInterfaceA,demo13MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写B方法");
    }
}
