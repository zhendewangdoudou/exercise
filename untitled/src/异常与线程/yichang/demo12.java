package 异常与线程.yichang;

import java.util.Scanner;

/*
如果用户名存在 抛出异常并提示
步骤：
1.使用数组保存已经注册过的用户名（数据库）
2.使用Scanner获取用户输入的注册的用户名（前端，页面）
3.定义一个方法 对用户输入的中注册的用户名进行判断
  遍历存储已经注册过用户名的数组 获取每一个用户名
  使用获取到的用户名和用户输入的用户名比较
  true：用户名已存在 抛出异常
  false：继续遍历比较如果循环结束了 还没有找到重复的提示注册成功
 */
public class demo12 {
    //数组保存已经注册过的用户名（数据库）
    static String[] usernames = {"张三","李四","王五"};
    public static void main(String[] args) throws demo11registerException {
        //2.使用Scanner获取用户输入的注册的用户名（前端，页面）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入注册的用户名");
        String username = sc.next();
        checkUsername(username);

    }
    
    //定义一个方法 对用户输入的中注册的用户名进行判断
    public static void checkUsername(String username) throws demo11registerException {
        //遍历存储已经注册过用户名的数组 获取每一个用户名
        for (String s : usernames) {
            //使用获取到的用户名和用户输入的用户名比较
            if(s.equals(username)){
                //true：用户名已存在 抛出异常
                throw new demo11registerException("该用户已经被注册了");
            }
        }
        //继续遍历比较如果循环结束了 还没有找到重复的提示注册成功
        System.out.println("恭喜您，注册成功了");
    }

}
