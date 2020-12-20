package jihe.collectionjihe.collectionsgongjuleo;

public class demo02person implements Comparable<demo02person> {
    private String name;
    private int age;

    public demo02person() {
    }

    @Override
    public String toString() {
        return "demo02person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public demo02person(String name, int age) {
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

    @Override
    public int compareTo(demo02person o) {
        //return 0;
        //自定义比较规则
        //比较两个人的年龄，this 和参数person
        return this.getAge() - o.getAge();//年龄升序排序
    }
}
