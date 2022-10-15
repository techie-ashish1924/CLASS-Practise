import java.lang.annotation.Target;
import java.util.Scanner;

public class Question3_Coins_Combinations {

    // public static void Combinations(int coins[],int sum,String ans,int target)
    // {
        // if(sum == target)
        // {
            // System.out.println(ans);
            // return;
        // }
        // else if(sum > target)
        // {
            // return;
        // }

        // for (int i = 0; i < coins.length; i++) {

            // if(sum <= target)
            // {
                // sum = sum+coins[i];
                // Combinations(coins,sum,ans+coins[i], target);

            // }
            // sum = 0;    
        // }
    // }

    public static void Printanswer(int coins[],int amount,String ans)
    {
        if(amount == 0)
        {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            
            if(amount >= coins[i])
            {
                // amount -= coins[i];
                Printanswer(coins, amount-coins[i], ans+coins[i]);
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int coins[] = new int[n];
        for (int i = 0; i < coins.length; i++) {
            // if(sum <= target)
            coins[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Printanswer(coins, target,"");

        // Combinations(coins, 0, "", target);
    }
    
}
