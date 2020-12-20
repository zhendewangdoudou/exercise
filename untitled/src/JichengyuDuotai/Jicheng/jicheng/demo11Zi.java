package JichengyuDuotai.Jicheng.jicheng;

public class demo11Zi extends demo11Fu {

    int num = 20;

    public void showNum(){
        int num = 10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methodA(){
        System.out.println("aaa");
    }
    public void methodB(){
        this.methodA();
        System.out.println("bbbb");
    }

    public demo11Zi(){
        this(10);//本类无参构造调用本类有参构造
    }
    public demo11Zi(int n){

    }
}
