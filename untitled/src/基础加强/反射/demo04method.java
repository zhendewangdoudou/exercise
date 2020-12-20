package 基础加强.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo04method {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        //1获取personclass对象
        Class personclass = demo01person.class;

        Method eatmethod = personclass.getMethod("eat");
        demo01person per = new demo01person();
        eatmethod.invoke(per);

        Method eatme2 = personclass.getMethod("eat", String.class);
        eatme2.invoke(per,"饭");

        System.out.println("======================");
        //获取所有peublic的方法
        Method[] methods = personclass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        //获取类名
        String name = personclass.getName();
        System.out.println(name);

    }
}
