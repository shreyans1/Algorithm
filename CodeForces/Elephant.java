package CodeForces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int steps = 0;
        for(int i = 5 ; i > 0 ; i--)
        {
            steps = n/i + steps;
            n = n%i;
        }
        System.out.println(steps);
        s.close();
    }
    
}