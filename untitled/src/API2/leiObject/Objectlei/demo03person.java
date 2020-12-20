package API2.leiObject.Objectlei;

public class demo03person {


    private String name;
    private int age;

    @Override
    public boolean equals(Object obj){
        //增加判断 如果传递的obj是this、本身 直接返回true
        if(obj == this){
            return true;
        }
        //增加判断传递的参数obj如果是null 直接返回false 可以提高程序的效率
        if(obj == null){
            return false;
        }
        //增加判断 防止类型转换异常
        if(obj instanceof demo03person){
            //使用向下转型，吧obj转为person型
            demo03person p = (demo03person)obj;
            //比较两个对象的属性，一个对象是this(p1),一个对象是p（obj->p2）
            boolean b = this.name.equals(p.name)&&this.age == age;
            return b;
        }
        //不是person类型直接返回false
        return false;
    }
    public demo03person() {
    }

    public demo03person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
