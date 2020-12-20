package JDK8新特性;

public class demo01logger {
    //定义一个根据日志的级别，显示日志信息的方法
    public static void showlog(int level,String message){
        //对日志等级进行判断，如果是1级别，那么输出日志日期
        if(level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用showlog方法 传递日志级别和日志信息
        showlog(1,msg1+msg2+msg3);

    }
}
