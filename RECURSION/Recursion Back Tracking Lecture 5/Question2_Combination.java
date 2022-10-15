import java.util.Scanner;

public class Question2_Combination {


    public static void Combinations(boolean board[],int tq,int qpsf,String ans,int ind)
    {
        if(qpsf == tq)
        {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            
            if(board[i] == false)
            {
                board[i] = true;
                Combinations(board, tq, qpsf, ans, ind+1);
            }
        }

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean board[] = new boolean[n];
        int tq = sc.nextInt();
    }
    
}
