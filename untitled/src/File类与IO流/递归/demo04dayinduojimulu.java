package File类与IO流.递归;

import java.io.File;

public class demo04dayinduojimulu {
    public static void main(String[] args) {
        File file = new File("D:\\xuexi");
        getAllFile(file);
    }
    /*
    定义方法  参数传递file类型的目录
    方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            //对遍历的File对象f进行判断 判断是否是文件夹
            if(file.isDirectory()){
                //是一个文件夹则继续遍历这个文件夹
                //发现getAllFiled方法就是传递文件夹，遍历文件夹的方法
                //所以直接调用getAllField方法即可：递归
                getAllFile(file);
            }else{
                System.out.println(file);
            }

        }
    }
}
