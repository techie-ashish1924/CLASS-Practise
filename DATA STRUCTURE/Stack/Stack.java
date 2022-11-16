import java.util.Scanner;

public class Stack {

    /*   WITHOUT CONSTRUCTOR

    private int arr[] = new int[5];
    private int top = -1;
    */

    // USING CONSTRUCTOR

     private int[] arr;
    private int top;

    public Stack()
    {
        arr = new int[5];
        top = -1;
    }

    public Stack(int n)
    {
        arr = new int[n];
        top = -1;
    }


    // BOOLEAN EMPTY

    public boolean IsEmpty()
    {
        return top == -1;
    }

    // IS FULL

    public boolean IsFull()
    {
        return top == arr.length-1;
    }

    // PUSH FUNCTION

    public void Push(int item) throws Exception
    {
        if(IsFull())
        {
            throw new Exception("BkLol Stack full hai");
        }

        top++;
        arr[top] = item;
    }

    // POP OPERATION

    public int Pop() throws Exception
    {
        if(IsEmpty()) 
        {
            throw new Exception("BkLol stack Khali hai");
        }
        int val = arr[top];
        top--;
        return val;
    }

    // PEEK FUNCTION

    public int Peek() throws Exception
    {
        if(IsEmpty())
        {
            throw new Exception("BkLol stack Khali hai");
        }
        return arr[top];
    }

    // SIZE OF STACK

    public int Size()
    {
        return top+1;
    }

    // DISPLAY

    public void DISPLAY()
    {
        for (int i = 0; i <= top; i++) 
        {
            System.out.println(arr[i]);
        }
    }



    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);


    // }
    
}
