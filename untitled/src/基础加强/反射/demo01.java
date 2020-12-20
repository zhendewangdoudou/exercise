package 基础加强.反射;

public class demo01 {
    /*
    获取class对象三种方式

     */
    public static void main(String[] args) throws ClassNotFoundException {
        //1class.forname
        Class cls1 = Class.forName("基础加强.反射.demo01person");
        System.out.println(cls1);

        //2.类名.class
        Class cls2 = demo01person.class;
        System.out.println(cls2);

        //3对象.getclass
        demo01person per = new demo01person();
        Class cls3 = per.getClass();
        System.out.println(cls3);

        //验证是不是一个对象
        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3 );
    }
}
