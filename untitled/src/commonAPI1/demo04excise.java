package commonAPI1;

import java.util.ArrayList;
import java.util.Random;

public class demo04excise {
    /*
    生成6个1到33之间的随机整数，添加到集合，并遍历集合
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33)+1;
            list.add(num);
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //练习2
        ArrayList<demo04Studeng> list1 = new ArrayList<>();

        demo04Studeng one = new demo04Studeng("洪七公",20);
        demo04Studeng two = new demo04Studeng("欧阳锋",22);
        demo04Studeng three = new demo04Studeng("黄药师",21);
        demo04Studeng four = new demo04Studeng("段智兴",23);

        list1.add(one);
        list1.add(two);
        list1.add(three);
        list1.add(four);

        for (int i = 0; i < list1.size(); i++) {
            demo04Studeng stu = list1.get(i);
            System.out.println("姓名"+stu.getName()+",年龄"+stu.getAge());

        }


        //练习3
        System.out.println("练习3");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("张三丰");
        list3.add("宋远桥");
        list3.add("张无忌");
        list3.add("张翠山");

        //自定义
        printArrayList(list3);

        System.out.println("；练习4++++++++");
        ArrayList<Integer> bigList = new ArrayList<>();
        Random ri = new Random();
        for (int i = 0; i < 20; i++) {
            int numIn = ri.nextInt(100)+1;
            bigList.add(numIn);

        }
        System.out.println(getSmallList(bigList));


    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if(bigList.get(i) % 2 == 0){
                smallList.add(bigList.get(i));
            }
        }
        return smallList;
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size()-1){
                System.out.print(name+"}");
            }else {
                System.out.print(name + "@");
            }
        }
    }
}
