package LetCode;

import java.util.HashMap;
import java.util.Map;

class Buddy_Strings {
    public static boolean buddyStrings(String A, String B) {
        boolean e = Boolean.FALSE;
        if(A.equals(B))
        {
            Map<Character,Integer> fre = new HashMap<>();
            for(char c : A.toCharArray())
            {
                if(fre.get(c)!=null) return true;

                fre.put(c, 1);
            }
            return false;
        }
        
        if(A.length()!=B.length())return false;
        
        for(int i = 0 ; i < A.length() ; i++ )
        {
            if(A.charAt(i)==B.charAt(i)) continue;
            else{

                for(int j = i+1 ; j < A.length() ; j++)
                {
                    if(A.charAt(j)!=B.charAt(j))
                    {
                        
                        String c = swapChar(A, i, j);
                        if(c.equals(B)) e= Boolean.TRUE;

                        break;
                        
                    }
                }
            }
        }
        return e;
        
    }

    private static String swapChar(String s,int i , int j)
    {
        StringBuilder ss = new StringBuilder();
        ss.append(s.subSequence(0, i)).append(s.charAt(j))
        .append(s.subSequence(i+1, j)).append(s.charAt(i))
        .append(s.subSequence(j+1, s.length()));

        return ss.toString();
    }
    public static void main(String[] args) {
        System.out.println(buddyStrings("aaaaaaabc","aaaaaaacb"));
    }
}