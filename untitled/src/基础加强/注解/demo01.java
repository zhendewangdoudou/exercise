package 基础加强.注解;
@SuppressWarnings("all")
public class demo01 {

    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //不建议使用了
    }


    public void show2(){
        //建议使用它替代上边的
    }
}
