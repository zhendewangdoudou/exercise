package File类与IO流.递归;

import java.io.File;

public class demo05wenjiansousuo {
    /*
    D:\xuexi文件夹中的以.pdf为结尾的文件
     */
    public static void main(String[] args) {
        File file = new File("D:\\xuexi");
        getAllFile(file);
    }
    /*
    定义方法  参数传递file类型的目录
    方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            //对遍历的File对象f进行判断 判断是否是文件夹
            if(file.isDirectory()){
                //是一个文件夹则继续遍历这个文件夹
                //发现getAllFiled方法就是传递文件夹，遍历文件夹的方法
                //所以直接调用getAllField方法即可：递归
                getAllFile(file);
            }else{
                /*
                只要pdf结尾的文件
                1.把File对象转换为字符串对象3中方法
                 */
                //String name = file.getName();//获得文件的名称
                //String path = file.getPath();
                String s = file.toString();
                //2.调用String类中的方法endWith判断字符串是否以.pdf结尾
                //返回的是布尔值
                boolean b = s.endsWith(".pdf");
                //3 如果是以.pdf结尾则输出
                if(b){
                    System.out.println(file);
                }


            }

        }
    }
}
