package jihe.collectionjihe.shujujiegou;

import java.util.LinkedList;

public class demo01Linkedlist {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    public static void show03(){
        //移除
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        System.out.println(linked.removeFirst());
        System.out.println(linked);
        System.out.println(linked.removeLast());
        System.out.println(linked);
        System.out.println(linked.pop());
        System.out.println(linked);

    }
    public static void show02(){
        //获取
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        if(!linked.isEmpty()){
            System.out.println(linked.getFirst());
            System.out.println(linked.getLast());
        }

    }

    public static void show01(){
        //添加的方法 addFirst addLast  push
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        linked.addFirst("www");
        System.out.println(linked);
        linked.push("http");
        System.out.println(linked);
        linked.addLast("com");
        System.out.println(linked);
        linked.add("cn");
        System.out.println(linked);
    }
}
