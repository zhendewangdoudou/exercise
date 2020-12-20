package commonAPI1;

public class demo02niming {

    public static void main(String[] args) {
        demo02nimingPerson one = new demo02nimingPerson();

        one.name = "高圆圆";
        one.showName();

        System.out.println("=================");
        //匿名对象
        new demo02nimingPerson().name = "赵又廷";//对象被创建了可以在后边.name
        new demo02nimingPerson().showName();
    }
}
