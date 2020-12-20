package API2.leiObject.baozhuanglei;

public class demo03 {
    public static void main(String[] args) {
        //基本-字符串
        int i1 = 100;
        String s1 = i1+"";
        System.out.println(s1+200);
        String s2 = Integer.toString(i1);
        System.out.println(s2+200);
        String s3 = String.valueOf(s1);
        System.out.println(s3+200);

        int i = Integer.parseInt(s1);
        System.out.println(i+200);
    }
}
