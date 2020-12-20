package JichengyuDuotai.Jicheng.jicheng;

public class demo10Zi extends demo10Fu {
    int num = 20;

    public void methodZi(){
        System.out.println(super.num);//父类的
    }

    public void method(){
        super.method();//访问父类的method
        System.out.println("zilei fangfa ");
    }
    public demo10Zi(){
        super();
    }
}
