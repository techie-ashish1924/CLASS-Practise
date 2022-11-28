import java.util.Scanner;
import java.util.Stack;

public class Find_Next_Greater_Element_Of_Array {

    public static void NGE(int arr[])
    {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++)
        {

            while(!stack.isEmpty() && arr[i] > arr[stack.peek()])
            {
                ans[stack.pop()] = arr[i];

            }
            stack.push(i);
        }

        while(!stack.isEmpty())
        {
            ans[stack.pop()] = -1;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
       

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }

        NGE(arr);
     
        
    }
}
