package JichengyuDuotai.Jicheng.neibulei;

public class demo01 {
    public static void main(String[] args) {
        demo01body body = new demo01body();//外部类对象
        //通过外部类的对象，调用外部类的方法，里面间接在使用内部咧
        body.methodBody();

        demo01body.Heart heart = new demo01body().new Heart();
        heart.beat();
    }
}
