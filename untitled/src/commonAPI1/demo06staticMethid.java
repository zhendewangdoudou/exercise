package commonAPI1;

public class demo06staticMethid {
    public static void main(String[] args) {
        demo06Static obj = new demo06Static();
        obj.method();

        //调用静态方法
        obj.methodStatic();//正确不推荐
        demo06Static.methodStatic();//类名.静态方法
    }


}
