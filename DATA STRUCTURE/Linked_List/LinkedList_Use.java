package Linked_List;

public class LinkedList_Use {

    public static void main(String[] args) throws Exception{
        
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.Display();
        ll.addLast(50);
        ll.Display();

        ll.AddatIndex(100, 2);
        ll.Display();

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAtIndex(2));
        ll.deleteFirst();
        ll.Display();
    }
    
}
