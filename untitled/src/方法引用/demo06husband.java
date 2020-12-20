package 方法引用;
/*
通过this引用本类的成员方法
 */
public class demo06husband {
    public void buyhouse(){
        System.out.println("北京二环");
    }

    public void marry(demo06richable r){
        r.buy();
    }
    public void soHappy(){
        marry(()->{
            this.buyhouse();
        });

        /*
        this存在
        buyhouse存在
         */
        marry(this::buyhouse);
    }

    public static void main(String[] args) {
        new demo06husband().soHappy();
    }
}
