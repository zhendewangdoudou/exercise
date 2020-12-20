package JichengyuDuotai.Jicheng.neibulei;

public class demo16Hero {

    private String name;
    private demo16Skill skill;//英雄技能


    public void attack(){
        System.out.println("我叫"+name+"，开始释放技能");
        skill.use();//调用接口中的方法
        System.out.println("释放技能完成");

    }
    public demo16Hero() {
    }

    public demo16Hero(String name, demo16Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public demo16Skill getSkill() {
        return skill;
    }

    public void setSkill(demo16Skill skill) {
        this.skill = skill;
    }
}
