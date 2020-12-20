package 基础加强.基础加强1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import 基础加强.基础加强1.calculate;

public class calculatetest {

    /*
    初始化方法
    用于组员申请，所有测试方法都会现实向
     */
    @Before
    public void init(){
        System.out.println("init。。。。");
    }
    @After
    public void close(){
        System.out.println("close");
    }

    @Test
    public void testAdd(){
        System.out.println("执行了");
        //创建计算器对象
        calculate cc = new calculate();
        int res = cc.add(1, 2);
       // System.out.println(res);
        //3断言 断言结果是3
        Assert.assertEquals(2,res);
    }
}
