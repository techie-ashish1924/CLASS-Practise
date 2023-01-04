        import java.util.Scanner;

// last element set at that position
// lesser eleemnt is present left side
// greater element is present at right side

public class Ques2 {

    public static void Swap(int arr[],int f,int l)
    {
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public static void Partition(int arr[],int si,int ei)
    {
        // int l = arr.length;
        int item = arr[ei];
        // int pos_ind = 0;
        int pi=si;
        
        for (int i = si; i < ei; i++) {
            
            if(arr[i] < item)
            {
                Swap(arr, pi, i);
                pi++;
            }
        }  
        Swap(arr, pi, ei);
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
        Partition(arr, 0, n-1);
        Display(arr);
    }
    
}
