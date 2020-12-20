package jihe.collectionjihe.fanxing;

import java.util.Objects;

public class demo02 {
    public static void main(String[] args) {

        demo02genericclass gc = new demo02genericclass();
        gc.setName("");
        Object obj = gc.getName();

        demo02genericclass<Integer> gc2 = new demo02genericclass();
        gc2.setName(2);
        Integer name = gc2.getName();
        System.out.println(name);

        demo02genericclass<String> gc3 = new demo02genericclass();
        gc3.setName("haha");
        String name1 = gc3.getName();
        System.out.println(name1);



    }
}
