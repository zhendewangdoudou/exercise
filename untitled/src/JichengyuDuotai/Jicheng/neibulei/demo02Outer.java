package JichengyuDuotai.Jicheng.neibulei;

public class demo02Outer {

    int num = 10;//外部类成员变量

    public class inner{

        int num = 20;//内部类成员变量

        public void methodInner(){
            int num = 30;//内部类方法的局部变量
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(demo02Outer.this.num);
        }
    }
}
