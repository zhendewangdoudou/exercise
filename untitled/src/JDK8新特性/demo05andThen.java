package JDK8新特性;

import java.util.function.Consumer;

/*
andThen：需要两个consumer接口
 可以把两个consumer接口组合到一起，再对数据进行消费

 */
public class demo05andThen {
    //定义方法 方法的参数传递一个字符串和两个consumer接口，consumer接口的泛型使用字符串
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
        //con1.accept(s);
        //con2.accept(s);

        //使用andthen方法
        con1.andThen(con2).accept(s);//con1连接con2，先执行con1消费数据
    }

    public static void main(String[] args) {
        method("hello",
                (t)->{
            //消费方式 吧字符串转换为大写输出
                    System.out.println(t.toUpperCase());
        },
                (t)->{
                    System.out.println(t.toLowerCase());
                });


    }

}
