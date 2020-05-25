package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = s.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        
        int revsum = 0;
        int ans = 0;
        for(int i = n-1;i>-1;--i)
        {
            if(revsum>(sum-revsum)) break;
            revsum+=arr[i];
            ans++;


        }
        System.out.println(ans);
    }
}