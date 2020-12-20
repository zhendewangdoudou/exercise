package JichengyuDuotai.Jicheng.neibulei;

public class demo15 {

    public static void main(String[] args) {
        demo15Hero hero = new demo15Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        //创建武器对象
        demo15weapon weapon = new demo15weapon("多兰剑");

        //为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack();

    }
}
