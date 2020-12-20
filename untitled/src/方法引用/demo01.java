package 方法引用;

public class demo01 {
    //定义方法
    public static void printString(demo01printtable p){
        p.print("Hello world");
    }

    public static void main(String[] args) {
        //调用pringtString
        printString((s)->{
            System.out.println(s);
        });

        printString(System.out::println);
    }
}
