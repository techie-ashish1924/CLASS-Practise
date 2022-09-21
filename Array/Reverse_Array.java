import java.util.Scanner;

public class Reverse_Array {
    public static void Reverse(int arr[])
    {
        int low = 0;
        int high = arr.length-1;

        while(low<=high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void Display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("array is : ");
        Display(arr);
        Reverse(arr);
        System.out.println(" \n `After reversing array is : ");
        Display(arr);
    }
    
}
