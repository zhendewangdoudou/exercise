package commonAPI1;

public class demo06Student {
    private int id;//学号自动生成
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0;//计数其每new一个新对象 就要自动++

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public demo06Student() {
        this.id=++idCounter;
    }

    public demo06Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
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
