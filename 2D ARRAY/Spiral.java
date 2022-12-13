import java.util.Scanner;

public class Spiral {

    public static void Spiral(int arr[][],int n,int m)
    {
        // int row = 0;
        // int col = arr[1].length;

        int min_row = 0;
        int max_row = n-1;
        int min_col = 0;
        int max_col = m-1;

        int c = 0;
        int te = n*m;
        while(c < te)
        {
            for (int i = min_col; i <= max_col && c < te; i++) 
            {
                System.out.print(arr[min_row][i] + " ");
                c++;
            }
            // System.out.println();

            min_row++;
            for (int i = min_row; i <= max_row && c < te; i++) 
            {
                System.out.print(arr[i][max_col] + " ");
                c++;
            }

            // System.out.println();


            max_col--;
            for (int i = max_col; i >= min_col && c < te; i--) {
                System.out.print(arr[max_row][i] + " ");
                c++;
            }
            // System.out.println();


            max_row--;

            for (int i = max_row; i >= min_row && c < te; i--) {
                System.out.print(arr[i][min_col] + " ");
                c++;
            }
            min_col++;

        }
    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Spiral(arr, n, m);
    }
    
}
