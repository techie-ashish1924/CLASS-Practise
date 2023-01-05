public class Cycle_Create {

    
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


    public void CreateCycle() throws Exception
    {
        tail.next = GetNode(2);
    }
    

    public Node MeetingPoint()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null  && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if  (slow == fast )
            {
                return slow;
            }
        }
        
        return null;
    }


    public void CycleRemoval()
    {
        Node meet = MeetingPoint();

        if(meet == null)
        {
            return;
        }


        Node temp = meet;
        int count = 1;

        while(temp.next != meet)
        {
            count++;
            temp = temp.next;
        }

        Node fast = head;

        for(int i=1;i<=count;i++)
        {
            fast = fast.next;
        }

        Node slow = head;

        while(slow.next != fast.next)
        {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;

    }


    public void Cycle_Removal2()
    {


        Node meet = MeetingPoint();

        if(meet == null)
        {
            return;
        }

        Node fast = meet;

        Node slow = head;

        while(slow.next != fast.next)
        {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;

    }
}
