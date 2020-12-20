package 异常与线程.xianchengshixianfangshi;

public class demo01person {
    private  String name;

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name+"->"+i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public demo01person(String name) {
        this.name = name;
    }

    public demo01person() {
    }
}
