package API2.leiObject.Objectlei;

public class demo02equals {
    public static void main(String[] args) {
        demo02person p1 = new demo02person("迪丽热巴",18);
        demo02person p2 = new demo02person("古力娜扎",19);

        System.out.println("p1"+p1);
        System.out.println("p2"+p2);
        System.out.println(p1.equals(p2));//比较地址值



    }
}
