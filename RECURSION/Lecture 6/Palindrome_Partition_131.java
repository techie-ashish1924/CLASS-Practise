import java.util.List;
import java.util.Scanner;

public class Palindrome_Partition_131 {
    // List<List<String>>
    public static  void partition(String ques, String ans)
    {

        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }

        for(int cut = 1;cut<=ques.length();cut++)
        {
            String s1 = ques.substring(0,cut);
            partition(ques.substring(cut), ans+s1+" ");
        }

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        partition(a, "");
    }
    
}
