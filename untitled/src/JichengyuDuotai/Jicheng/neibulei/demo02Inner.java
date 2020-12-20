package JichengyuDuotai.Jicheng.neibulei;

public class demo02Inner {
    public static void main(String[] args) {
        demo02Outer.inner obj = new demo02Outer().new inner();
        obj.methodInner();
    }
}
