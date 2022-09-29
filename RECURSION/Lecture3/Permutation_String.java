import java.util.Scanner;

public class Permutation_String {

    public static void Printanswer(String a,String ans)
    {
        if(a.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            String s1 = a.substring(0, i);
            String s2 = a.substring(i+1);
            Printanswer(s1+s2, ans + ch);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = "abc";
        Printanswer(a, "");
    }
    
}
