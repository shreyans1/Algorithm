package CodeForces;
import java.util.*;

public class Watermelon

{
    static String solve(int w)
    {
        if(w==2) return "NO";
        if(w%2==0) return "YES";
        return "NO";
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int w = s.nextInt();

        System.out.println(solve(w));
        s.close();

    }
}