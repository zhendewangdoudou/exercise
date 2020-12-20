package commonAPI1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class demo05String {

    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();//字符串什么内容都没有
        System.out.println("first"+str1);

        //根据字符数组创建字符串
        char[] chararray = {'a','b','c'};
        String str2 = new String(chararray);
        System.out.println("two"+str2);

        //根据字节数组的内容创建
        byte[] bytearray = {97,98,99};
        String str3 = new String(bytearray);
        System.out.println("three"+str3);

        //直接创建
        String str4 = "hello";
        System.out.println("four"+str4);

        System.out.println("=========================");

        String str11 = "abc";
        String str12 = "abc";
        char[] charArr = {'a','b','c'};
        String str13 = new String(charArr);

        System.out.println(str11 == str12);
        System.out.println(str11 == str13);
        System.out.println(str12 == str13);

        System.out.println("=======常见方法===========");
        System.out.println("========equals==========");
        String str21 = "Hello";
        String str22 = "Hello";
        char[] charAr = {'H','e','l','l','o'};
        String str23 = new String(charAr);
        System.out.println(str21.equals(str22));
        System.out.println(str21.equals(str23));
        System.out.println(str22.equals(str23));
        System.out.println("Hello".equals(str21));

        System.out.println("======================================");
        String strA  = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));

        //获取长度
        int length = "akjfanconca".length();
        System.out.println(length);

        //拼接字符串
        String str111 = "Hello";
        String str112 = "World";
        String str113 = str111.concat(str112);
        System.out.println(str111);
        System.out.println(str112);
        System.out.println(str113);//全新的字符串
        System.out.println("==============");

        //获取指定索引位置的单个字符
        char  ch = "Hello".charAt(1);
        System.out.println("在1号位置的字符"+ch);
        System.out.println("==============");

        //查找参数字符串在本来字符串中第一次出现的索引位置
        //没找到用-1
        String orig = "HelloWorld";
        System.out.println(orig.indexOf("llo"));

        //字符串截取
        String str31 = "HelloWorld";
        String str32 = str31.substring(5);
        System.out.println(str31);
        System.out.println(str32);
        System.out.println("=================");

        String str33 = str31.substring(4,7);
        System.out.println(str33);

        String str41 = "Hello";
        System.out.println(str41);
        str41 = "Java";
        System.out.println(str41);//


        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("================");

        //转换称为字节数组
        byte[] bytes ="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==================");

        String str = null;
        String str51 = "How do you do";
        String str52 = str51.replace("o","*");//返还新的字符串
        System.out.println(str51);
        System.out.println(str52);

        //字符串的分割
        String str61 = "aaa,bbb,ccc";
        String[] str62 = str61.split(",");
        System.out.println(str61);
        for (int i = 0; i < str62.length; i++) {
            System.out.println(str62[i]);
        }

        String str63 = "XXX.YYY.ZZZ";
        String[] str64 = str63.split("\\.");//必须加\\不然出不来
        for (int i = 0; i < str64.length; i++) {
            System.out.println(str64[i]);
        }

        //练习1 【word1#word2#word3】
        int[] array = {1,2,3};
        String res = fromArrayToString(array);
        System.out.println(res);


        //练习2
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String input = sc.next();

        int countUpper = 0;//大写
        int countLower = 0;//小写
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch1 = charArray[i];
            if('A'<= ch1 && ch1<='Z'){
                countUpper++;
            }else if('a'<=ch1 && ch1<='z'){
                countLower++;
            }else if('0'<=ch1 && ch1<='9'){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母有"+countUpper);
        System.out.println("小写字母有"+countLower);
        System.out.println("数字有"+countNumber);
        System.out.println("其他"+countOther);


    }



    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                str += "word" + array[i] + "]";
            }else{
                str +="word" + array[i]+"#";
            }

        }
        return str;
    }
}
