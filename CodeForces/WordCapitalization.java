package CodeForces;

import java.util.Scanner;
import java.lang.StringBuilder;;

public class WordCapitalization {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    String c = s.next();
    
    String half = c.substring(1);
    StringBuilder ss = new StringBuilder();
    ss.append(c.substring(0, 1).toUpperCase());
    ss.append(half);
    System.out.println(ss);
    s.close();
    }
    
}