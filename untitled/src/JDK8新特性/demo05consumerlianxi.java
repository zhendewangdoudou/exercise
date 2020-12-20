package JDK8新特性;

import java.util.function.Consumer;

/*
下面字符串数组当中有多条信息，请按照格式“姓名：xx，性别：xx”的格式
打印出来
 */
public class demo05consumerlianxi {
//定义一个方法参数传递string类型数组和两个consumer接口，
    public static void printinfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        //遍历字符串数组
        for (String message : arr) {
            //使用andThen方法连续两个consumer接口，消费字符串
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        //定义一个字符串类型的数据
        String[] arr = {"迪丽热巴,女","古力娜招,女","马尔扎哈,男"};

        //调用printinfo,传递
        printinfo(arr,
                //对message进行切割 获取姓名，按照指定格式输出
                (message)->{
            String name = message.split(",")[0];
                    System.out.print("姓名:"+name);
        },(message)->{
            String age = message.split(",")[1];
                    System.out.println("年龄:"+age+".");
                });

    }
}
