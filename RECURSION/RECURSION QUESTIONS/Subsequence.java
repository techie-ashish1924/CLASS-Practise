import java.util.Scanner;

public class Subsequence {

    public static int res;
    public static void PrintSub(String ques,String ans)
    {
        if(ques.length() == 0)
        {
            System.out.println(ans);
            res++;
            return ;
        }

        char ch = ques.charAt(0);
        PrintSub(ques.substring(1), ans);
        PrintSub(ques.substring(1), ans+ch);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        PrintSub(a, "");
        System.out.println(res);

    }
    
}
