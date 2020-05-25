package CodeForces;

import java.util.Scanner;

public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();
        String cc = s.next();
        char[] arr = cc.toCharArray();
        while(t-->0)
        {
            for(int i = 0 ; i < n-1 ; i++)
            {
                if(arr[i]=='B' && arr[i+1]=='G')
                {
                    arr[i] = 'G';
                    arr[i+1] = 'B';
                    i++;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char o : arr)
        {
            ans.append(o);
        }
        System.out.println(ans);
        s.close();
    }
    
}