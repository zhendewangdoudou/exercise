package utils;

import java.net.URL;

public class getpath {
    public static void main(String[] args) {
        ClassLoader classLoader = jdbcutild.class.getClassLoader();
        URL res = classLoader.getResource("jdbc.properties");
        String path = res.getPath();
        System.out.println(path);
    }
}
