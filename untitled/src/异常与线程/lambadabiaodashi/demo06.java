package 异常与线程.lambadabiaodashi;

import java.util.ArrayList;

public class demo06 {
    public static void main(String[] args) {
        //JDK1.7之前
        ArrayList<String> list01 = new ArrayList<String>();
        //JDK1.7之后泛型可以省略 可以根据前面的推导出来
        ArrayList<String> list02 = new ArrayList<>();
    }
}
