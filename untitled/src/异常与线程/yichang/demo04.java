package 异常与线程.yichang;

import java.util.Objects;

public class demo04 {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
        //对传递过来的参数进行合法性判断，判断是否为null
//        if(obj == null){
//            throw new NullPointerException("传递的对象的值是null");
//        }
        Objects.requireNonNull(obj);
    }
}
