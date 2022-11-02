import java.util.Scanner;

public class Quick_Sort {

    public static void Display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Swap(int arr[],int f,int l)
    {
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public static int Partition(int arr[],int si,int ei)
    {
        int pi = si;
        int pivot = arr[ei];

        for (int i = si; i < ei; i++) {
            
            if(arr[i] < pivot)
            {
                Swap(arr, pi, i);
                pi++;
            }
        }
        Swap(arr, pi, ei);
        return pi;
    }

    public static void QuickSort(int arr[],int si,int ei)
    {
        if(si > ei)
        {
            return;
        }
        int pi = Partition(arr, si, ei);
        QuickSort(arr, si, pi-1);
        QuickSort(arr, pi+1, ei);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        QuickSort(arr, 0, n-1);

        Display(arr);
    }
    
}
