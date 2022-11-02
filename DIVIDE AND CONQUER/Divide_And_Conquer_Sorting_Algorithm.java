import java.util.Scanner;

public class Divide_And_Conquer_Sorting_Algorithm {

    public static void Display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }
    }

    public static int[] Sort(int arr[],int si,int ei)
    {

        if(si == ei)
        {
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid = (si+ei)/2;
        int fs[] = Sort(arr, si, mid);
        int ss[] = Sort(arr, mid+1, ei);
        
        return MergeTwoArray(fs,ss);
     }

     public static int[] MergeTwoArray(int arr1[],int arr2[])
     {
        int i = 0;
        int j = 0;
        int k = 0;
        int ans[] = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                ans[k] = arr1[i];
                i++;
                k++;
            }
            else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length)
        {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length)
        {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
     }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int arr2[]  = Sort(arr, 0, n-1);
        Display(arr2);
    }
}




// public static void Partition(int arr[],int si,int ei)
// {
    // int pi = si;
    // int item = arr[ei];
    // for (int i = si; i < ei; i++) {
        // if(arr[i] < item)
        // {
            // Swap(arr, pi, i);
            // pi++;
        // }
    // }
    // Swap(arr, pi, ei);
// }
    // 


    // public static void Swap(int arr[],int f,int l)
    // {
        // int temp = arr[l];
        // arr[l] = arr[f];
        // arr[f] = temp; 
    // }