package API2.leiObject.baozhuanglei;

public class demo01 {

    public static void main(String[] args) {
        //装箱 构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1);//重写了toString

        Integer in2 = new Integer("1");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        Integer in4 = Integer.valueOf("1");
        System.out.println(in3);
        System.out.println(in4);

        //拆箱
        int  i = in1.intValue();
        System.out.println(i);
    }
}
