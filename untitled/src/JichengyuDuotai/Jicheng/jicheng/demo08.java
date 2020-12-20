package JichengyuDuotai.Jicheng.jicheng;

public class demo08 {
    public static void main(String[] args) {
        demo08phone phone = new demo08phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("============");

        demo08NewPhone newPhone = new demo08NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
