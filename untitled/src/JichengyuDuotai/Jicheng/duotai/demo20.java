package JichengyuDuotai.Jicheng.duotai;

public class demo20 {
    public static void main(String[] args) {
        demo20Animal animal = new demo20cat();//猫向上转型为动物

        animal.eat();

        //animal.catMouth();//不可以调用方法
        //向下转型还原
        demo20cat cat = (demo20cat) animal;
        cat.catMouth();//可以调用方法了 还原成功

        //向下转型错误 不能向狗转型
        demo20dog dog = (demo20dog) animal;
        dog.lookdoor();
    }
}
