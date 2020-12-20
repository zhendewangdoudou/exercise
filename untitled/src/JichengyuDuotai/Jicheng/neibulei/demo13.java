package JichengyuDuotai.Jicheng.neibulei;

public class demo13 {
    public static void main(String[] args) {
        demo13MyInterfaceImpl impl = new demo13MyInterfaceImpl();
        impl.method1();

        demo13MyInterface obj = new demo13MyInterfaceImpl();
        obj.method1();

        demo13MyInterface obj1 = new demo13MyInterface() {
            @Override
            public void method1() {
                System.out.println("111");
            }

            @Override
            public void method2() {
                System.out.println("2222");
            }

        };
        obj1.method1();
        obj1.method2();

        new demo13MyInterface(){

            @Override
            public void method1() {
                System.out.println("1111-b");
            }

            @Override
            public void method2() {
                System.out.println("22222-b");
            }
        }.method2();
    }


}
