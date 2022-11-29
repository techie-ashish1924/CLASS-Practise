import java.util.Scanner;

public class Normal_Queen_Positions {

    public static void Queen_Position(boolean board[],int n,int qafs, String pos)
    {
        if(n == qafs)
        {
            System.out.println(pos);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            
            if(board[i] == false)
            {
                board[i] = true;
                Queen_Position(board, n, qafs+1, pos + "b" + i + "q" + qafs + " ");
                board[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 2;
        boolean board[] = new boolean[4];

        Queen_Position(board, n, 0, "");


    }
    
}
