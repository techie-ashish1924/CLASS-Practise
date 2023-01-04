package Linked_List;

public class LinkedList {


    private class Node {

        int val;
        Node next;
    }
    

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item)
    {
        Node nn = new Node();
        nn.val = item;

        if (this.size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            // tail = head;
            head = nn;
            size++;
        }
    }
    
    public void Display()
    {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.val + "-->");
            curr = curr.next;
        }
        System.out.println("Null.");
    }
    

    public void addLast(int item)
    {
        Node nn = new Node();
        nn.val = item;

        if(size == 0)
        {
            head = nn;
            tail = nn;
            size++;
        }
        else {
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
}
