package API2.leiObject.Objectlei;

public class demo03equals {
    public static void main(String[] args) {
        demo03person p1 = new demo03person("迪丽热巴",18);
        demo03person p2 = new demo03person("古力娜扎",19);
        demo03person p3 = new demo03person("古力娜扎",19);


        System.out.println("p1"+p1);
        System.out.println("p2"+p2);
        System.out.println(p1.equals(p2));//比较地址值
        System.out.println(p2.equals(p3));



    }
}
