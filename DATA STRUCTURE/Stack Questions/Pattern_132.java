import java.util.Scanner;
import java.util.Stack;

public class Pattern_132 {

    public static boolean Find(int arr[])
    {
        int [] min = new int[arr.length];
        min[0] = arr[0];

        for (int i = 1; i < min.length; i++) {
            min[i] = Math.min(min[i-1], arr[i]);
        }

        Stack<Integer> stack = new Stack<>();
        for(int j=arr.length-1;j>= 0;j--)
        {
            int ith = min[j];
            while(!stack.isEmpty() && ith >= arr[stack.peek()])
            {
                stack.pop();
            }

            if(!stack.isEmpty() && arr[j] > arr[stack.peek()])
            {
                return true;
            }
            stack.push(j);
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4};

        System.out.println(Find(arr));
    }
    
}
