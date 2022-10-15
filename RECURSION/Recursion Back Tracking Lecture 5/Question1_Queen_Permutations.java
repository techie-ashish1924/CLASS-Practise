import java.util.Scanner;

public class Question1_Queen_Permutations {

    // qpsf - > queen place so far.

    public static void Print_Answer(boolean []board, int tq,int qpsf,String ans)
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
                Print_Answer(board, tq, qpsf+1, ans + "b" + i + "q" + qpsf);
                board[i] = false;
            }
        }



    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean board[] = new boolean[n];


        // int arr[] = new int[n];
        // for (int i = 0; i < arr.length; i++) {
            // arr[i] = sc.nextInt();
        // }
        int queen = sc.nextInt();
        Print_Answer(board, queen, 0,"");
    }
    
}
