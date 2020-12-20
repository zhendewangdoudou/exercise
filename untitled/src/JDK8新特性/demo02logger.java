package JDK8新特性;

public class demo02logger {
    /*
    使用lambda优化日志案例
    lambda的特点：延迟加载
    lambda的使用前提：必须存在函数式接口
     */

    //定义一个显示日志的方法 方法参数传递日志等级 和messagebuilder接口
    public static void showlog(int level,demo02messageBuilder ms){
        //对日志等级进行判断，如果是1级别，那么调用接口中的buildermessge方法
        if(level == 1){
            System.out.println(ms.builderMessage());
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用showlog方法 传递日志级别和日志信息
        //demo02messageBuilder是函数式接口 所以可以用lambda函数式接口
        showlog(2,()->{
            System.out.println("不满足条件不执行");
            //返回一个拼接好的字符串
            return msg1+msg2+msg3;
        });
        
    }
}
