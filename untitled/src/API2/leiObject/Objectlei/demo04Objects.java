package API2.leiObject.Objectlei;

import java.util.Objects;

public class demo04Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aBc";
        System.out.println(s1.equals(s2));
        String s3 = null;
        System.out.println(s1.equals(s3));//空指针异常
        /*
        Objects 的equals方法 防止空指针异常
         */
        System.out.println(Objects.equals(s2,s3));
    }
}
