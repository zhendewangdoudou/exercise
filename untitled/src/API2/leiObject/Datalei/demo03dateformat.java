package API2.leiObject.Datalei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo03dateformat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    public static void demo01(){
        //dateformat类中的format 吧日期格式化为文本
        //步骤1创建Simpledateformat对象 构造方法中传递指定的模式
        //2调用
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }

    public static void demo02() throws ParseException {
        //解析
        //步骤1创建simpledateformat对象
       // 2调用
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2019年12月16日 22时36分41秒");
        System.out.println(date);
        Date date1 = sdf.parse("2019年12月16日 22时36分41");
        System.out.println(date1);
    }
}