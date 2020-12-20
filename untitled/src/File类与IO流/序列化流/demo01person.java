package File类与IO流.序列化流;

import java.io.Serializable;

public class demo01person implements Serializable {
    private String name;
    private int age;

    public demo01person() {
    }

    public demo01person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "demo01person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
