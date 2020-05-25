package CodeForces;

import java.util.Scanner;
public class Team {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for(int i = 0 ; i < n ; ++i)
        {
            
            int tempc = 0;
            for(int k = 0 ; k < 3 ; k++)
            {
                int temp = s.nextInt();
                if(temp==1) tempc++;
            }
            if(tempc>1) count++;
        }
        System.out.println(count);
        s.close();
    }

}