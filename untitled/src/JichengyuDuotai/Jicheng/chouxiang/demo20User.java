package JichengyuDuotai.Jicheng.chouxiang;

public class demo20User {

    private String name;//姓名
    private int money;//余额，当前=用户拥有金钱数量

    public demo20User() {
    }

    public demo20User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show(){
        System.out.println("我叫"+name+",我有"+money+"钱");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
