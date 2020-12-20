package JichengyuDuotai.Jicheng.chouxiang;

import java.util.ArrayList;

public class demo20 {
    public static void main(String[] args) {
        demo20Manager maneger = new demo20Manager("群主",100);

        demo20member member = new demo20member("A",0);
        demo20member member1 = new demo20member("B",0);
        demo20member member2 = new demo20member("C",0);

        maneger.show();
        member.show();
        member1.show();
        member2.show();
        System.out.println("===================");

        //群主发20元3个红包
        ArrayList<Integer> redList = maneger.send(20,3);
        //三个成员收红包
        member.receive(redList);
        member1.receive(redList);
        member2.receive(redList);

        maneger.show();
        member.show();
        member1.show();
        member2.show();

    }
}
