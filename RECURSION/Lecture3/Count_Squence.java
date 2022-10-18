import java.util.Scanner;

public class Count_Squence {

    static int count = 0;

    public static int SubSequence(String a,String ans)
    {
        if(a.length() == 0)
        {
            System.out.println(ans);
            return 1;
        }
        char ch = a.charAt(0);
        int ans1  = SubSequence(a.substring(1), ans);
        int ans2 = SubSequence(a.substring(1), ans + ch);

        return ans1 + ans2;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(SubSequence(a, ""));
    }
    
}
