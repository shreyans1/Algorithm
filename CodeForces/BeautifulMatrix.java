package CodeForces;

import java.util.Scanner;

public class BeautifulMatrix {
    
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Scanner s = new Scanner(System.in);
        int x = 0;
        int y = 0;
        for(int i = 0; i < 5 ; i++)
        {
            for(int j = 0 ; j < 5 ; j++)
            {
                arr[i][j] = s.nextInt();
                if(arr[i][j]==1)
                {
                    x= i;
                    y = j;
                }

            }
        }
        System.out.println(Math.abs(x-2)+Math.abs(y-2));
        s.close();
    }
}
