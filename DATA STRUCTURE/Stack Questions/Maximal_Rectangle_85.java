import java.util.Scanner;

public class Maximal_Rectangle_85 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int matrix[][] = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};

        int ans[] = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
                
                if(matrix[i][j] == 1)
                {
                    ans[j]++;
                }
                else{
                    ans[j] = 0;
                }
            }
            area = Math.max()
        }
    }
    
}
