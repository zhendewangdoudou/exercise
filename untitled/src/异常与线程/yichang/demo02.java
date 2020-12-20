package 异常与线程.yichang;

public class demo02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int e = getElement(arr, 0);
        System.out.println(e);
        int e1 = getElement(arr, 3);
        System.out.println(e1);
    }
    /*
    定义方法获取数组指定索引处的元素
     */
    public static int getElement(int[] arr,int index){
        int ele = arr[index];
        return ele;
    }
}
