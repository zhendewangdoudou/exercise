package 基础加强.反射;

import java.lang.reflect.Field;

public class demo02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //1获取personclass对象
        Class personclass = demo01person.class;
        //2获取成员变量
        Field[] fields = personclass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("=============");

        Field a = personclass.getField("a");
        demo01person p1 = new demo01person();
        Object valur = a.get(p1);
        System.out.println(valur);
        a.set(p1,"张三");
        System.out.println(p1);

        System.out.println("=============");
        Field[] declaredFields = personclass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }


        System.out.println("=============");
        Field d = personclass.getDeclaredField("d");
        d.setAccessible(true);//暴力反射
        Object v2 = d.get(p1);
        System.out.println(v2);
    }
}
