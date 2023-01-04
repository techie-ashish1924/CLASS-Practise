import java.util.Arrays;
import java.util.Scanner;

public class AGGCROW {


    public static boolean IsItPossible(int arr[],int min,int cow)
    {
        int no_cow = 1;
        int pos = arr[0];
        int i=1;

        while(i<arr.length)
        {
            if(arr[i]-pos >= min)
            {
                no_cow++;
                pos = arr[i];


            }
            if(no_cow >= cow)
            {
                return true;
            }
            i++;
            
        }


        return false;
    }

    public static int Minimum(int stals[] , int cow)
    {
        Arrays.sort(stals);
        int n = stals.length;
        int lo = 0;
        int hi = stals[n-1] - stals[0];
        int ans = 0;
        while(lo <= hi)
        {
            int mid = (lo + hi)/2;

            if(IsItPossible(stals,mid,cow))
            {
                ans = mid;
                lo = mid + 1;
            }
            else{
                hi = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int text = sc.nextInt();

        while (text > 0)
        {

            int n = sc.nextInt();
            int cow = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Minimum(arr,cow));
            text--;
        }
    }
    
}
