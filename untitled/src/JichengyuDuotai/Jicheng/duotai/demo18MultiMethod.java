package JichengyuDuotai.Jicheng.duotai;

public class demo18MultiMethod {

    public static void main(String[] args) {
        demo17Fu obj = new demo17zi();

        obj.method();//父子都有优先子
        obj.methodFu();//子类没有父类有向上找父类



    }
}
