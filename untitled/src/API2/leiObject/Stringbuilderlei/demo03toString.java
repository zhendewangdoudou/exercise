package API2.leiObject.Stringbuilderlei;

public class demo03toString {
    public static void main(String[] args) {
        //String->StringBuilder
        String str = "Hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        bu.append("world");
        System.out.println(bu);

        //转回来
        String s = bu.toString();
        System.out.println(s);
     }
}
