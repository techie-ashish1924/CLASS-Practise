import java.util.Scanner;

public class Min_Of_Array {

    public static int Minimun(int arr[])
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum Number is : " + Minimun(arr));
        
    }
    
}
