import java.util.Scanner;
import java.util.Stack;

public class Insert_Down {

    public static void Insert(Stack<Integer> stack,int item)
    {
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        Insert(stack,-3);
        System.out.println(stack);
    }


    
}
