import java.util.Scanner;
import java.util.Stack;

public class Largest_Rectangle_In_Histogram_84 {

    public static int LargestRectangle(int arr[])
        {

            Stack<Integer> stack = new Stack<>();

            int max_area = 0;
            for (int i = 0; i < arr.length; i++) 
            {
                while(!stack.isEmpty() && arr[i] < arr[stack.peek()])
                {
                    int h = arr[stack.pop()];
                    int r = i;
                    
                    if(stack.isEmpty())
                    {
                        max_area = Math.max(max_area, h*r);
                    }
                    else{
                        int l = stack.peek();

                        max_area = Math.max(max_area, h*(r-l-1));
                    }
                }

                stack.push(i);
                
            }

            int r = arr.length;

            while(!stack.isEmpty())
            {
                int h = arr[stack.pop()];

                if(stack.isEmpty())
                {
                    max_area = Math.max(max_area, h*r);
                }

                else{
                    int l = stack.peek();
                    max_area = Math.max(max_area, h*(r-l-1));
                }

            }

            
            return max_area;
            // return 10;
        }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(LargestRectangle(arr));


    }
    
}
