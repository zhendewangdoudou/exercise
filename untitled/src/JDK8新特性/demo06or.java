package JDK8新特性;

import java.util.function.Predicate;

public class demo06or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
        // return pre1.test(s) || pre2.test(s);

        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "ngsj";
        boolean b =checkString(s,(String str)->{
            return str.length()>5;
        },(String str)->{
            return str.contains("a");
        });
        System.out.println(b);
    }
}
