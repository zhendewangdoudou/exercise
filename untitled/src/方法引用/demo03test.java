package 方法引用;
/*
通过对象名引用成员方法
对象名存在
成员方法存在
 */
public class demo03test {
    public static void printString(demo01printtable p){
        p.print("Hello");
    }
    public static void main(String[] args) {
        printString((s)->{
            //创建method对象
            demo02method obj = new demo02method();
            obj.printUpperCase(s);
        });

        /*
        方法引用优化
         */
        demo02method obj = new demo02method();
        printString(obj::printUpperCase);
    }
}
