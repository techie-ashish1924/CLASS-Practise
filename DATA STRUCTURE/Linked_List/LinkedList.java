package Linked_List;

public class LinkedList {


    private class Node {

        int val;
        Node next;
    }
    

    private Node head;
    private Node tail;
    private int size;

    // O(1)

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
    
    // O(n)

    public void Display()
    {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.val + "-->");
            curr = curr.next;
        }
        System.out.println("Null.");
    }
    
    // O(1)

    public void addLast(int item)
    {
        Node nn = new Node();
        nn.val = item;

        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
    
    // O(n)

    private Node GetNode(int k) throws Exception {
        if (k < 0 && k >= size) {
            throw new Exception("BkLol Aukat m rho K ki value Limit m dalo");
        }

        Node temp = head;

        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
        return temp;
    }
    

    public void AddatIndex(int item, int k) throws Exception
    {
        if (k < 0 || k > size) {
            throw new Exception("Out Of limit chale gye tum");
        }

        if (k == 0) {
            addFirst(item);
        } else if (k == size) {
            addLast(item);
        }

        else {
            Node nn = new Node();
            nn.val = item;

            Node address = GetNode(k - 1);
            nn.next = address.next;
            // Node temp = address.next;
            address.next = nn;

        }
    }
    
    public int getFirst()
    {
        return head.val;
    }

    public int getLast()
    {
        return tail.val;
    }

    public int getAtIndex(int k) throws Exception
    {
        // Node temp = GetNode(k);
        // return GetNode(k).val;
        return GetNode(k).val;
    }

    public int deleteFirst()
    {
        Node temp = head;

        head = head.next;

        temp.next = null;
        size--;
        return temp.val;

    }
    
    public int deleteLast() throws Exception
    {
        if (size == 1) {
            size--;
            return deleteFirst();

        } else {
            Node temp = GetNode(size - 1);
            int rv = tail.val;

            temp.next = null;

            tail = temp;

            size--;

            return rv;

        }

    }
    
    public int deleteAtIndex(int k) throws Exception
    {

        if (k == 0)
        {
            return deleteFirst();
        }

        if (k == size - 1)
        {
            return deleteLast();
        }
        else {
            
            Node prev = GetNode(k - 2);
            int rv = prev.next.val;
            Node curr = prev.next.next;
            prev.next = curr;
            
            size--;
            return rv;
        }

    }





}
