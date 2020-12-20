package File类与IO流.递归;

public class demo01 {
    public static void main(String[] args) {
       // a();
        b(1);
    }
    //构造方法 禁止递归
    public demo01(){
        //demo01();
    }

    private static void b(int i ) {
        System.out.println(i);
        if(i == 20000){
            return;//结束方法
        }
        b(++i);
    }

    private static void a() {
        System.out.println("a方法");
        a();
    }

}
