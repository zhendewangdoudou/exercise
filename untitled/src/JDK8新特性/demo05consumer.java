package JDK8新特性;

import java.util.function.Consumer;

/*
消费性接口 consumer  accept方法
 */
public class demo05consumer {
    /*
    定义一个方法
    方法的参数传递一个字符串的姓名
    方法的参数传递consumer接口 泛型使用string
    可以使用consumer接口消费字符串的姓名
     */
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        //调用method方法从，传递字符串姓名方法的另一个参数是consumer接口
        //使用lambda表达式
        method("赵丽颖",(String name)->{
            //对传递的字符串进行消费
            //消费方式直接输出字符串
            System.out.println(name);

            //消费方式：字符串反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });

    }
}
