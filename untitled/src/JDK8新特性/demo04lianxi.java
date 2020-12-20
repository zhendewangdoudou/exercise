package JDK8新特性;

import java.util.function.Supplier;

/*
求数组元素最大值
使用supplier接口作为方法参数类型，通过lambda表达式求出int数组中最大值
提示泛型类型Integer
 */
public class demo04lianxi {
    //定义方法
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个int类型数组 并赋值
        int[]  arr = {100,-50,88,99,33,-30};
        //调用getMax方法，方法的参数Supplier是一个函数式接口
        int maxVau = getMax(()->{
            //获取数组的最大值，并返回
            //定义一个变量 吧数组中第一个元素赋值给他，记录数组元素最大值
            int max = arr[0];
            for (int i : arr) {
                //使用其他的元素和max比较
                if(i > max){
                    //如果i>max则替换max
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxVau);
    }
}
