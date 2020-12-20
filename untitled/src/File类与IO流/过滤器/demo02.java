package File类与IO流.过滤器;

import java.io.File;
import java.io.FileFilter;

public class demo02 {
    public static void main(String[] args) {
        File file = new File("D:\\xuexi");
        getAllFile(file);
    }
    /*
    定义方法  参数传递file类型的目录
    方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
       // System.out.println(dir);
        File[] files = dir.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname){
                //过滤规则
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith("pdf");
            }
        });//传递过滤器对象
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
