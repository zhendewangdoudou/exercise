package 异常与线程.yichang;
/*
自定义异常类
 */
public class demo11registerException extends Exception{
    //添加空参数构造方法
    public demo11registerException(){

    }
    //添加带异常信息的构造方法
    //方法内部会调用父类带异常信息的构造方法，让父类处理
    public demo11registerException(String message){
        super(message);
    }
}
