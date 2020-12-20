package 两种stream流获取方式;

import java.util.ArrayList;

/*
有两个arraylist集合存储队伍当中的多个成员姓名，要求使用传统的for循环
依次进行以下若干操作
 1.第一个队伍只要名字为3个字的成员姓名，存储到一个新集合中
 2.第一个队伍筛选之后只要前三个人 存储到一个新集合中
 3.第二个队伍只要姓张的成员姓名存储到一个新集合中
 4.第二个队伍筛选之后不要前两个人存储到一个新集合中
 5.将两个队伍合并为一个队伍存储到一个新集合中
 6.根据姓名创建person对象，存储到一个新集合中
 7.打印整个队伍的person对象信息
 */
public class demo09lianxi {
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        //1.第一个队伍只要名字为3个字的成员姓名，存储到一个新集合中
        ArrayList<String> one1 = new ArrayList<>();
        for (String name : one) {
            if(name.length() == 3){
                one1.add(name);
            }
        }
        //2.第一个队伍筛选之后只要前三个人 存储到一个新集合中
        ArrayList<String> one2  = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            one2.add(one1.get(i));
        }



        //第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("赵四");
        two.add("张天爱");
        two.add("张二狗");

        //3.第二个队伍只要姓张的成员姓名存储到一个新集合中
        ArrayList<String> two1 = new ArrayList<>();
        for (String name : two) {
            if(name.startsWith("张")){
                two1.add(name);
            }
        }
        //4.第二个队伍筛选之后不要前两个人存储到一个新集合中
        ArrayList<String> two2 = new ArrayList<>();
        for (int i = 2; i < two1.size(); i++) {
            two2.add(two1.get(i));
        }

        //5.将两个队伍合并为一个队伍存储到一个新集合中
        ArrayList<String> all = new ArrayList<>();
        all.addAll(one2);
        all.addAll(two2);


        //6.根据姓名创建person对象，存储到一个新集合中
        ArrayList<demo09person> list = new ArrayList<>();
        for (String name : all) {
            list.add(new demo09person(name));
        }

        for (demo09person demo09person : list) {
            System.out.println(demo09person);
        }
    }

}
