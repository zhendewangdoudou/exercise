package 方法引用;
//类的构造器引用
public class demo07demo {
    //定义方法参数传递姓名和buildperson
    public static void printname(String name,demo07personbuilder pb){
        demo07person per = pb.buildperson(name);
        System.out.println(per.getName());
    }

    public static void main(String[] args) {
        //
        printname("迪丽热巴",(String name)->{
            return new demo07person(name);
        });

        //方法引用优化
        //person（string name）已知
        //new已知
        printname("古力娜扎",demo07person::new);
    }
}
