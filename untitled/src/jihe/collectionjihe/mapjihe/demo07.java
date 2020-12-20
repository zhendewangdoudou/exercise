package jihe.collectionjihe.mapjihe;

import java.util.HashMap;
import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:str.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        for(Character key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
    }
}
