package JDK8新特性;

import java.util.function.Predicate;

public class demo06negate {
    public static boolean checkString(String s, Predicate<String> pre1){


        //return !pre1.test(s);
        return pre1.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "abc";
        boolean b =checkString(s,(String str)->{
            return str.length()>5;
        });
        System.out.println(b);
    }
}
