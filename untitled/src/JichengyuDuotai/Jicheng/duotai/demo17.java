package JichengyuDuotai.Jicheng.duotai;

public class demo17 {
    public static void main(String[] args) {
        //使用多态父类引用只想子类对象
        demo17Fu obj = new demo17zi();

        System.out.println(obj.num);//等号左边是谁就是谁

        obj.showNum();

    }
}
