import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class N_Queen {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 4;
        boolean [][] board = new boolean[n][n];


    }

    public static void N_QueenProblem(boolean [][]board, int tq,int row)
    {

        if(tq == 0)
        {
            Display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            
            if(issafe(board,row,col) == true)
            {
                board[row][col] = true;

                N_QueenProblem(board, tq-1, row+1);

                board[row][col] = false;
            }
        }
    }

    // display

    public static void Display(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // condition check

    public static boolean issafe(boolean board[][],int row,int col)
    {
        int r = row;

        // Vertical

        while(r >= 0)
        {
            if(board[r][col] == true)
            {
                return false;
            }
            r--;
        }

        // left diagonal
        
        r = row;
        int c = col;

        while(r >= 0 && c < board.length)
        {
            if(board[r][c] == true)
            {
                return false;
            }
            c++;
            r--;
        }


        return false;
    }
    
}
