package JichengyuDuotai.Jicheng.neibulei;

public class demo15Hero {

    private String name;//名字
    private demo15weapon weapon;//武器
    private int age;//年龄

    public demo15Hero() {
    }

    public void attack(){
        System.out.println("年龄为"+age+"的"+name+"用"+weapon.getCode()+"攻击敌方");
    }
    public demo15Hero(String name, demo15weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public demo15weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(demo15weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
