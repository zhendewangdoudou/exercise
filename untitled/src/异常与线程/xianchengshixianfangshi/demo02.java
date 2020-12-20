package 异常与线程.xianchengshixianfangshi;

public class demo02 {
    //创建thread类的子类

    public static void main(String[] args) {
        //创建子类对象
        demo02Mythread mt = new demo02Mythread();
        //调用start
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }
    }
}
