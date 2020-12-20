package jihe.collectionjihe.collectionsgongjuleo;

public class demo03student {
    private String name;
    private int age;

    public demo03student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "demo03student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public demo03student() {
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
