package 两种stream流获取方式;

public class demo09person {
    private String name;

    public demo09person() {
    }

    public demo09person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "demo09person{" +
                "name='" + name + '\'' +
                '}';
    }
}
