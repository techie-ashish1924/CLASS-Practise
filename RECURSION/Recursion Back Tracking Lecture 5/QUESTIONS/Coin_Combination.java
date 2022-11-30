import java.util.Scanner;

public class Coin_Combination {

    public static void Combination(int coins[],int amount,String ans)
    {
        if(amount == 0)
        {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            
            if(amount >= coins[i])
            {
                amount = amount - coins[i];
                Combination(coins, amount, ans+coins[i]);
                amount = amount + coins[i];
            }
        }
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int n = s
        int arr[] = {2,3,5,6};
        int amount= 10;

        Combination(arr, amount, "");
    }
    
}
