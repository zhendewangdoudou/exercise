package JichengyuDuotai.Jicheng.neibulei;

public class demo04Outer {

    public void methodOuter(){
        int num = 10;//所在方法的局部变量
        //num = 20; 不能改变num局部变量
        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
