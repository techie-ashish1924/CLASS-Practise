import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence_Of_String {

    public static void Sequence(int []ques,List<Integer> ans)
    {
        if(ques.length == 0)
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

        int n = 3;
        int arr[] = { 1, 2, 3 };
        // String str = sc.next();
        // String ans = "";
        ArrayList<Integer> ans = new ArrayList<>();
        Sequence(arr, ans);


    }
    
}
