package JichengyuDuotai.Jicheng.jicheng;

public class Demo01jicheng {
    public static void main(String[] args) {
        demo01Teacher teacher = new demo01Teacher();//创建子类对象
        teacher.method();//继承了父类的method方法

        demo01Assisitent assisitent = new demo01Assisitent();
        assisitent.method();
    }
}
