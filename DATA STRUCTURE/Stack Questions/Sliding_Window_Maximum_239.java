import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Sliding_Window_Maximum_239 {

    public static int[] Print_Sliding(int arr[],int k)
    {
        int ind = 0;
        Deque<Integer> dq = new LinkedList<>();
        int [] ans = new int[arr.length-k + 1];

        // first window 

        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && arr[i] > arr[dq.getLast()])
            {
                dq.removeLast();
            }

            dq.add(i);
        }
        ans[ind++] = arr[dq.getFirst()];
        // 

        for(int i=k;i<arr.length;i++)
        {
            while(!dq.isEmpty() && arr[i] > arr[dq.getLast()])
            {
                dq.removeLast();
            }
            dq.add(i);

            if(dq.isEmpty() && dq.getFirst() == i-k)
            {
                dq.removeFirst();
            } 
            ans[ind++] = arr[dq.getFirst()];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

        return ans;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        int arr[] = {1,3,-1,-3,5,3,6,7};
        // for(int i=0;i<n;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }

        int k = 3;

        System.out.println(Print_Sliding(arr, k));
    }
    
}
