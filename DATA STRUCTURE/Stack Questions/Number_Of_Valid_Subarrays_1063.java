import java.util.Scanner;
import java.util.Stack;

public class Number_Of_Valid_Subarrays_1063 {

    public static int Count_Subarray(int arr[])
    {
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++)
        {

            while(!stack.isEmpty() && arr[i] < stack.peek())
            {
                stack.pop();
            }

            stack.push(arr[i]);
            count += stack.size();
        }

        return count;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Count_Subarray(arr));
    }
    
}
