package Queue;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception
     {
        
        Scanner sc = new Scanner(System.in);

        Queue queue = new Queue();

        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);

        queue.DISPLAY();

        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
    }
    
}
