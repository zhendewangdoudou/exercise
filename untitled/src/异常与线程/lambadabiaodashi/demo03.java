package 异常与线程.lambadabiaodashi;

public class demo03 {
    public static void main(String[] args) {
        //调用invoke方法参数cook接kou  ,传递cook接口的匿名内部类对象
        invoke(new demo03cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭");
            }
        });
        //使用Lambda表达式简化匿名内部类书写
        invoke(()->{
            System.out.println("吃饭");
        });

        invoke(()-> System.out.println("吃饭"));
    }
    public static void invoke(demo03cook cook){
        cook.makeFood();
    }
}
