package jihe.collectionjihe.listjihe;

import java.util.LinkedList;

public class demo02Linkedlist {
    public static void main(String[] args) {
        show01();//添加
        show02();//获取
        show03();//移除

    }
    public static void show03() {
        LinkedList<String> linked = new LinkedList<>();

        //add
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //
        System.out.println(linked.removeFirst());
        linked.addFirst("a");
        System.out.println(linked.pop());
        System.out.println(linked.removeLast());
        System.out.println(linked);

    }
    public static void show02() {
        LinkedList<String> linked = new LinkedList<>();

        //add
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //获取
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
    }
    public static void show01(){
        LinkedList<String> linked = new LinkedList<>();

        //add
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        //addFirst
        linked.addFirst("www");
        System.out.println(linked);
        //push
        linked.push("www1");
        System.out.println(linked);
        //addLast
        linked.addLast("com");
        System.out.println(linked);
        linked.add("com1");
        System.out.println(linked);

    }
}
