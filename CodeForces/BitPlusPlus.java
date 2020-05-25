package CodeForces;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 0;
        for(int i = 0 ; i < n ;++i)
        {
            
            
                String c = s.next();
                if("X++".equals(c) || "++X".equals(c)) x++;
                else x--;
                if(i == n-1)
            {
                

                System.out.println(x);
            }
            
        }
    }
}