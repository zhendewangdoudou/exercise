package File类与IO流.File类;

import java.io.File;

public class demo01 {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        String separator = File.separator;
        System.out.println(separator);
    }
}
