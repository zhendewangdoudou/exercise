package commonAPI1;

import java.util.Random;
import java.util.Scanner;

public class demo03randomgae {

    public static void main(String[] args) {
        Random r = new Random();
        int randomInt = r.nextInt(100)+1;//[1,100]
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("输入猜测");
            int guessnum = sc.nextInt();

            if(guessnum > randomInt){
                System.out.println("太大了 请重试");
            }else if(guessnum < randomInt){
                System.out.println("太小了 请重试");
            }else{
                System.out.println("恭喜对了");
                break;//猜对了不用再重复了
            }
        }
    }
}
