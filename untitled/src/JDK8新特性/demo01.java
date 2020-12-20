package JDK8新特性;
/*
函数式接口的使用
 */
public class demo01 {

    //定义一个方法，参数使用函数式接口MyFunctionalInterface1
    public static void show(MyFunctionalInterface1 myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法 方法的参数是一个接口 可以传递接口的实现类对象
        show(new MyFunctionalInterface1Impl());

        //调用show方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        show(new MyFunctionalInterface1(){
            @Override
            public void method(){
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        //调用show方法，方法参数是一个函数式接口 所以我们可以lambda表达式
        show(()->{
            System.out.println("使用lambda表达式重写接口中的抽象方法");
        });

        //简化
        show(()->
                System.out.println("简化lambda"));
    }
}
