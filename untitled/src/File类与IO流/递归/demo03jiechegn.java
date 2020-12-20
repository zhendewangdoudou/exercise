package File类与IO流.递归;

public class demo03jiechegn {
    public static void main(String[] args) {
        int result = jiecheng(5);
        System.out.println(result);

    }
    private static int jiecheng(int n){
        if(n == 1){
            return 1;
        }
        return n*jiecheng(n-1);
    }
}
