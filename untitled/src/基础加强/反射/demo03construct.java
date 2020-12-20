package 基础加强.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class demo03construct {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        //1获取personclass对象
        Class personclass = demo01person.class;
        //2获取成员变量
        Constructor constructor = personclass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //创建对象
        Object per1 = constructor.newInstance("张三", 23);
        System.out.println(per1);

        System.out.println("====================");
        Constructor constructor1 = personclass.getConstructor();
        System.out.println(constructor1);
        Object per2 = constructor1.newInstance();
        System.out.println(per2);

        Object o = personclass.newInstance();
        System.out.println(o);


    }
}
