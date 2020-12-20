package commonAPI1;

public class demo06Static {
    public static void main(String[] args) {
        demo06Student one = new demo06Student("郭靖",18);
        demo06Student two = new demo06Student("黄蓉",16);
        one.room = "101教室";
        System.out.println(one.getId()+one.getName()+one.getAge()+one.room);
        System.out.println(two.getId()+two.getName()+two.getAge()+two.room);

        demo06Person one1 = new demo06Person();
        demo06Person two2 = new demo06Person();


    }

    public void method(){
        System.out.println("这是一个成员方法");
    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
    }
}
