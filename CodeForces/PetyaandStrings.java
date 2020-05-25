package CodeForces;

import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String firstString = s.next();
        String secondString = s.next();
        int n = firstString.compareToIgnoreCase(secondString);
        if(n==0) System.out.println(0);
        else if (n>0) System.out.println(1);
        else System.out.println(-1);
        s.close();
        
        
        
    }
}