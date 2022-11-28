import java.util.Scanner;

public class No_Conjecutive_Head_Allow {

    public static void Pattern(int n,String ans)
    {
        if(n == 0)
        {
            System.out.println(ans);
            return;
        }

        if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H')
        {
            Pattern(n-1, ans + 'H');
        }
        Pattern(n-1, ans + 'T');

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern(n, "");
    }
    
}
