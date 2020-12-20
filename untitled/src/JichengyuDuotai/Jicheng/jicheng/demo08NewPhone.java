package JichengyuDuotai.Jicheng.jicheng;

public class demo08NewPhone extends demo08phone {
    @Override
    public void show(){
        super.show();//使用父类的方法
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }

}
