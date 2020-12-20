package jihe.collectionjihe.setjihe;

public class demo02hashcode {
    public static void main(String[] args) {
        demo02person p1 = new demo02person();
        int h1  = p1.hashCode();
        System.out.println(h1);
        demo02person p2 = new demo02person();
        int h2 = p2.hashCode();
        System.out.println(h2);
        System.out.println(p1);
        System.out.println(p2);


        //String类哈希值
        //String类重写le Object的hashcode
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
