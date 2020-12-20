package 基础加强.反射;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class example {
    /*
  写一个框架 可以帮我们创建任意类的对象，并且执行其中任意方法
     */
    //前提 不能改变该类的任何代码 可以创建任意类的对象
    /*
      实现： 配置文件  反射
      步骤：将需要创建的对象的全类名和需要执行的方法定义在配置文件中
          在程序中加载读取配置文件
          使用反射技术来加载类文件进内存
          创建对象
          执行方法
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //加载配置文件
        //1.1创建properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //获取class目录下文件方式
        ClassLoader classLoader = example.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3加载该类金内存
        Class cls = Class.forName(className);
        //4创建对象
        Object obj = cls.newInstance();
        //5获取方法对象
        Method method = cls.getMethod(methodName);

        //6.执行方法
        method.invoke(obj);


    }


}
