package JichengyuDuotai.Jicheng.duotai;

public class demo16Multi {

    public static void main(String[] args) {
        //多态写法
        //左侧父类的引用指向了右侧子类的对象
        demo16Fu obj = new demo16Zi();
        obj.method();//new谁运行谁
        obj.methodfu();

    }
}
