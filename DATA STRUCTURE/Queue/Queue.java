package Queue;

public class Queue {

    private int[] arr;
    private int front=0;
    private int size=0;

    Queue()
    {
        arr = new int[5];
    }
    Queue(int n)
    {
        arr = new int[n];
    }

    // Is Empty method

    public boolean IsEmpty()
    {
        return size == 0;
    }

    // Is Full Mehtod

    public boolean IsFull()
    {
        return size == arr.length;
    }


    // Size method

    public int Size()
    {
        // return siz;
    }


    // enqueue method

    public void Enqueue(int item) throws Exception
    {
        if(IsFull())
        {
            throw new Exception("BkLol Queue Full hai");
        }
        arr[(front + size)%arr.length] = item;
        size++;
    }



    // dequeue method

    public int Dequeue() throws Exception
    {
        if(IsEmpty())
        {
            throw new Exception("BkLol Queue Khali hai");
        }
        int val = arr[front];
        front = (front + 1)%arr.length;
        return val;
    }



    // Get Front data

    public int GetFront()
    {
        return arr[front];
    }


    // DISPLAY

    public void DISPLAY()
    {
        for (int i = 0; i < size; i++) {
            
            int ind = (front + i)%arr.length;
            System.out.print(arr[ind] + " ");
        }
        // for (int i = front; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");            
        // }

        // for(int i=0;i<front;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
    }



    
}
