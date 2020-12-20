package 异常与线程.xianchengshixianfangshi;

public class demo01 {
    public static void main(String[] args) {
        //单线程程序
        demo01person p1 = new demo01person("小强");
        p1.run();

        demo01person p2 = new demo01person("旺财");
        p2.run();

    }
}
