package JichengyuDuotai.Jicheng.neibulei;

public class demo16 {
    public static void main(String[] args) {
        demo16Hero hero = new demo16Hero();
        hero.setName("艾希");

        //1使用单独定义的实现类
        hero.setSkill(new demo16skillimpl());

        //2使用匿名内部类
        demo16Skill skill1  =new demo16Skill(){
            @Override
            public void use(){
                System.out.println("pia");
            }
        };
        hero.setSkill(skill1);

        //3
        hero.setSkill(new demo16Skill() {
            @Override
            public void use() {
                System.out.println("lala");
            }
        });
        hero.attack();

    }
}
