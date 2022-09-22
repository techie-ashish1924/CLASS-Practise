import java.util.Scanner;

public class SubSequence_Of_String {

    public static void Sequence(String ques,String ans)
    {
        if(ques.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        Sequence(ques.substring(1), ans);
        Sequence(ques.substring(1), ans+ch);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ans = "";
        Sequence(str, ans);


    }
    
}
