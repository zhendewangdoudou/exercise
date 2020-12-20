package File类与IO流.过滤器;

import java.io.File;
import java.io.FileFilter;

/*
创建过滤器FileFilter的实现类，重写过滤方法accept定义过滤规则
 */
public class demo01FileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        /*
        过滤规则
         */
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".pdf");
    }
}
