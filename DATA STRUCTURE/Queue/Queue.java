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



    // enqueue method

    public void Enqueue(int item)
    {
        arr[size] = item;
        size++;
    }



    // dequeue method

    public int Dequeue()
    {
        int val = arr[front];
        front++;
        return val;
    }



    // Get Front data

    public int GetFront()
    {
        return arr[front];
    }



    
}
