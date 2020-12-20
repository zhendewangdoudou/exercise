package 异常与线程.lambadabiaodashi;

public class demo04person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "demo04person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public demo04person() {
    }

    public demo04person(String name, int age) {
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
