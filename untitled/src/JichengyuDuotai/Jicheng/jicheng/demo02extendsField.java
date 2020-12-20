package JichengyuDuotai.Jicheng.jicheng;

public class demo02extendsField {
    public static void main(String[] args) {
        demo02Fu fu = new demo02Fu();
        System.out.println(fu.numFu);//只能使用父类东西

        demo02Zi zi = new demo02Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);

        System.out.println(zi.num);
        //这个方法是子类的优先用子类的
        zi.methodZi();//200
        zi.methodFu();//这个方法是谁的
    }
}
