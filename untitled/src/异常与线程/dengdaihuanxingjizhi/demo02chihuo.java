package 异常与线程.dengdaihuanxingjizhi;

public class demo02chihuo extends Thread{
    private demo02baozi bz;
    public demo02chihuo(demo02baozi bz){
        this.bz = bz;
    }
    @Override
    public void run(){
        while (true){
            synchronized (bz){
                if(bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后哦执行的代码
                System.out.println("吃货正在吃："+bz.pi+bz.xian+"的包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把正在吃："+bz.pi+bz.xian+"的包子包子铺开始生产包子");
                System.out.println("===========");
            }
        }
    }
}
