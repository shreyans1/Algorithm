package CodeForces;

import java.util.Scanner;
import java.util.Stack;

public class StonesontheTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String c = s.next();
        char[] arr = c.toCharArray();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char cc : arr)
        {
            if(stack.isEmpty())
            {
                stack.push(cc);
            }
            else{
                if(stack.peek().equals(cc))
                {
                    count++;
                    
                }
                else{
                    stack.push(cc);
                }
            
            }
        }
        System.out.println(count);
        s.close();
    }
}