package 异常与线程.yichang;

public class demo10fu {
    public void show01() throws NullPointerException,ClassCastException{};
    public void show02() throws IndexOutOfBoundsException{};
    public void show03() throws IndexOutOfBoundsException{};
    public void show04(){};//不跑异常
}
class Zi extends demo10fu{
    public void show01() throws NullPointerException,ClassCastException{};//抛一样
    public void show02() throws ArrayIndexOutOfBoundsException{};//抛字类
    public void show03(){}//不声明;

    //public void show04(){}//不抛
    public void show04() {
        try {
            throw new Exception("bihi");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
