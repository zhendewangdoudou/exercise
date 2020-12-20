package 异常与线程.dengdaihuanxingjizhi;

public class demo02 {
    public static void main(String[] args) {
        demo02baozi bz = new demo02baozi();
        new demo02baozipu(bz).start();
        new demo02chihuo(bz).start();
    }
}
