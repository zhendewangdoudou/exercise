package fanshe;

public class demo01person {
     private String name;
     private int age;

     public String a;
    protected String b;
     String c;
    private String d;


    public demo01person() {
    }

    public demo01person(String name, int age) {
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
    public String toString() {
        return "demo01person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("eating.....");
    }

    public void eat(String food){
        System.out.println("eat...."+food);
    }
}
