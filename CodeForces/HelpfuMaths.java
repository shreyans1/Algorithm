package CodeForces;


import java.util.Arrays;
import java.util.Scanner;

public class HelpfuMaths {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String cc = s.next();
        char[] ll = cc.toCharArray();
        int size = ll.length/2+1;
        int arr[] = new int[size];
        int k = 0;
        for(int i = 0 ; i < ll.length;i++)
        {
            if(ll[i]!='+')
            {
                arr[k]=(int)ll[i]-48;
                k++;
            }
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < size;i++)
        {
            System.out.print(arr[i]);
            if(i!=size-1) System.out.print("+");
        }
        System.out.print("\n");
        s.close();
    }
}