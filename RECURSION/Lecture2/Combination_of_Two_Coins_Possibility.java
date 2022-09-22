import java.util.Scanner;

public class Combination_of_Two_Coins_Possibility {

    public static void Combinations(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }

        Combinations(n-1, ans + "H");
        Combinations(n-1, ans + "T");


    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(Combinations(n, ""));

        Combinations(n, "");
    }
    
}
