import java.util.Scanner;

public class Permutation_Donnot_Repeat {

    public static void NotRepeat(String a, String ans)
    {
        if(a.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < a.length(); i++) {
            
            char ch = a.charAt(i);
            boolean f = false;
            for(int j=i+1;j<a.length();j++)
            {
                if(a.charAt(j) == ch)
                {
                    f= true;
                    break;
                }
            }
        
        if (f == false) {
            
            String s1 = a.substring(0, i);
            String s2 = a.substring(i+1);
            NotRepeat(s1+s2, ans+ch);

        }
    }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = "abca";
        NotRepeat(a, "");
    }
    
}
