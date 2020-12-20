package JichengyuDuotai.Jicheng.jicheng;

public class demo04Zi extends demo04Fu {
    int num = 20;

    public void method(){
        int num = 30;

        System.out.println(num);//局部变量30
        System.out.println(this.num);//本类成员变量 20
        System.out.println(super.num);//10父类的
    }
}
