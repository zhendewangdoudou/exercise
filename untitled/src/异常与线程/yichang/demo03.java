package 异常与线程.yichang;

public class demo03 {
    public static void main(String[] args) {
        //int[] arr = null;
        int[] arr = new int[3];
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    /*
    定义方法获取数组指定索引处的元素
     */
    public static int getElement(int[] arr,int index){
        //如果数组的arr的值是null抛出空指针异常
        //告诉调用者传递的数组的值是null
        if(arr == null){
            throw new NullPointerException("传递的数组的值是null");
        }
        //对传递过来的参数进行合法性校验
        //如果index的范围不在数组的索引范围内，那么久跑出数组索引越界异常
        //告知调用者“索引超出数组使用范围”
        if(index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("索引超出数组使用范围");
        }
        int ele = arr[index];
        return ele;
    }

}
