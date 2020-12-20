package jihe.collectionjihe.collectionjihee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo02Iterata {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //添加元素
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");

        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

//        boolean b = it.hasNext();
//        System.out.println(b);
//        String s = it.next();
//        System.out.println(s);
    }
}
