package JichengyuDuotai.Jicheng.jiekou;

public interface demo09MyInterfacePrivateA {

    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }

    public default void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
