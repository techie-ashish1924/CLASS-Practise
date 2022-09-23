import java.util.Scanner;

public class Two_Consecutive_Head_Not_Present_in_CoinToss {

    public static void CoinToss(int n, String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        // class logic

        if(ans.length() == 0 || ans.charAt(ans.length() -1) != 'H')
        {
            CoinToss(n-1, ans + "H");
        }
            
        CoinToss(n-1, ans + "T");



        // apna logic

        // if(ans.length() == 0)
        // {
            // CoinToss(n-1,ans + "H");
            // CoinToss(n-1, ans + "T");
        // }

        // else
        // {
            // if(ans.charAt(ans.length()-1) == 'H')
            // {
                // CoinToss(n-1, ans + "T");
            // }

            // CoinToss(n-1, ans + "H");
            // if(ans.charAt(ans.length()-1) == 'T')
            // {
                // CoinToss(n-1, ans + "H");
                // CoinToss(n-1, ans+"T");
            // }
        // }
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CoinToss(n,"");
    }
    
}
