package JichengyuDuotai.Jicheng.duotai;

public class demo20instanceof {
    public static void main(String[] args) {
        demo20Animal animal = new demo20cat();
        animal.eat();

        //判断父类引用本来是不是dog
        if(animal instanceof demo20dog){
            demo20dog dog = (demo20dog) animal;
            dog.lookdoor();
        }
        if(animal instanceof demo20cat){
            demo20cat cat = (demo20cat) animal;
            cat.catMouth();
        }

    }
}
