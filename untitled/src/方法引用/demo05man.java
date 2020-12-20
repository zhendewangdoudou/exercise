package 方法引用;
/*
zilei
 */
public class demo05man extends demo05human{

    @Override
    public void sayhello() {
        System.out.println("hello ,man");
    }

    //方法 参数传递greatable
    public void method(demo05greatable g){
        g.greet();
    }

    public void show(){
        method(()->{
            //创建父类 对象
            demo05human h = new demo05human();
            //调用父类的
            h.sayhello();
        });

        //因为有子类父类关系 所以存在一个关键字super
        //代表父类 使用super 调用父类成员
      /*  method(()-{
            super.sayhello();
        });

       */
      /*
      使用super引用类的成员方法
      super存在
      父类成员方法存在

       */
      method(super::sayhello);
    }

    public static void main(String[] args) {

        new demo05man().show();
    }

}
