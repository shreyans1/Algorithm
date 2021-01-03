import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Monk_and_Power_of_Time {
    public static void main(String args[] ) throws Exception {
        

        //BufferedReader
          // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> order = new ArrayList<>(); 
        Queue<Integer> process = new PriorityQueue<>();
        for(int i = 0 ; i < n ; i++)
        {
            process.add(s.nextInt());
        }
        for(int i = 0 ; i < n ; i++)
        {
            order.add(s.nextInt());
        }
        
        int cost = 0;
        int i = 0;
        while(!process.isEmpty())
        {
            if(process.peek()==order.get(i))
            {
                process.poll();
                i++;
                cost++;
                System.out.println("in if");
            }
            else{
                cost++;
                int temp = process.remove();
                process.add(temp);
                System.out.println("in else");
            }
        }
        System.out.println(cost);

    }
}
