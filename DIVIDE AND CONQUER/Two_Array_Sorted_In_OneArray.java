import java.util.Scanner;

public class Two_Array_Sorted_In_OneArray {

    public static void Sorted(int arr1[],int arr2[])
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

        for (int l = 0; l < ans.length; l++) {
            System.out.print(ans[l] + " ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n  : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter first array ");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt(); 
        }

        System.out.println("enter the m : ");

        int m = sc.nextInt();

        int arr2[] = new int[m];
        System.out.println("Enter the value : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        Sorted(arr1, arr2);
    }
    
}
