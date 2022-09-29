import java.util.Scanner;

public class Dice_Problem {

    public static void PrintPath(int curr,int end,String ans)
    {
        if(curr == end)
        {
            System.out.println(ans);
            return;
        }

        if(curr > end)
        {
            return;
        }

        for(int dice =1 ;dice<=3 ;dice++)
        {
            PrintPath(curr+dice, end, ans+dice);
        }
        // PrintPath(curr+1, end, ans+1);
        // PrintPath(curr+2, end, ans+2);
        // PrintPath(curr+3, end, ans+3);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 4;
        PrintPath(0, n, "");

    }
    
}
