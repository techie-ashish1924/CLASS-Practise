package Dynamic_Memory_Stack_And_Queue;

import STACK.*;

public class Dynamic_Stacks extends Stack_1{

    @Override

    public void Push(int item) throws Exception
    {
        if(IsFull())
        {
            int a[] = new int[2* arr.length];

            for (int i = 0; i < arr.length; i++) {
                a[i] = arr[i];
            }
            arr = a;
        }

        super.Push(item);
    }

    public static void main(String[] args) throws Exception
    {
        
        Dynamic_Stacks ds = new Dynamic_Stacks();
        ds.Push(10);
        ds.Push(20);
        ds.Push(30);
        ds.Push(40);
        ds.Push(50);
        
    }
    
}
