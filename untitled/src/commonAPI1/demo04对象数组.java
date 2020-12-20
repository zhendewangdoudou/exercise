package commonAPI1;

public class demo04对象数组 {

    public static void main(String[] args) {
        //创建长度为3的数组 存放person类型 对象
        demo04person[] array = new demo04person[3];
        //创建对象
        demo04person one = new demo04person("迪丽热巴",18);
        demo04person two = new demo04person("古力娜扎",28);
        demo04person three = new demo04person("马儿扎哈",38);
        //将one当中的地址值赋值到数组的0号位置元素
        array[0] = one;
        array[1] = two;
        array[2] = three;

        //得到3个地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());
    }
}
