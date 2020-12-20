package 异常与线程.dengdaihuanxingjizhi;

public class demo02baozipu extends Thread {
   //需要在成员位置创建包子变量
    private demo02baozi bz;
    //使用带参数构造方法为袄子变量赋值
    public demo02baozipu (demo02baozi bz){
        this.bz = bz;
    }

    //设置线程任务
    @Override
    public void run(){
        int count = 0;
        //让包子铺一直生产包子
        while(true){
            synchronized (bz){
                if( bz.flag == true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //唤醒之后执行包子铺生产包子
                //交替生产两种包子
                if(count%2 == 0){
                    //生产薄皮三鲜馅包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                }else{
                    //生产冰皮牛肉馅
                    bz.pi = "冰皮";
                    bz.xian = "牛肉";
                }
                count++;
                System.out.println("包子铺正在生产："+bz.pi+bz.xian+"包子");
                //生产包子需要3秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //修改状态为由
                bz.flag = true;
                //唤醒吃货线程
                bz.notify();
                System.out.println("包子铺已经生产好了："+bz.pi+bz.xian+"包子，可以开始吃了");
            }
        }

    }
}
