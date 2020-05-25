package CodeForces;
import java.util.Scanner;
import java.lang.StringBuilder;
public class WayLong
{
    static void solve(String s)
    {
        if(s.length()<=10)
        {
            System.out.println(s);
        }
        else
        {
            StringBuilder ss = new StringBuilder();
            int size = s.length();
            ss.append(s.charAt(0));
            ss.append(size-2);
            ss.append(s.charAt(size-1));
            System.out.println(ss);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0 ; i < n ; ++i)
        {
            String check = scan.next();
            solve(check);

        }
        scan.close();;
    }
}