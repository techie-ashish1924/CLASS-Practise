import java.util.Scanner;

public class Find_indexFrom_Last {

    public static int Find(int arr[],int ind,int target)
    {
        if(ind < 0)
        {
            return -1;
        }
        if(arr[ind] == target)
        {
            return ind;
        }
        
            return Find(arr, ind-1, target);
    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

       System.out.println( Find(arr, n-1, target));
    }
    
}
