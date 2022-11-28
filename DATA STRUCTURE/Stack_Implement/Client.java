package Stack_Implement;

// import java.util.Scanner;
public class Client {

    public static void main(String[] args)  throws Exception
    {
        
        // Scanner sc = new Scanner(System.in);

        Stack stack =new Stack();
        stack.Push(10);
        stack.Push(20);
        stack.Push(30);
        stack.Push(40);
        stack.Push(50);

        stack.DISPLAY();
        stack.Push(60);
        stack.Peek();
    }
    
}
