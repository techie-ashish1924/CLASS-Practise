package heap;

public class heap_client {


    public static void main(String[] args) {
        
        Heap_Implement ob = new Heap_Implement();
        ob.add(10);
        ob.add(20);
        ob.add(30);
        ob.add(5);
        ob.add(7);
        ob.add(3);
        ob.add(2);
        ob.add(-10);
        ob.add(-20);

        System.out.println(ob.min());
        System.out.println(ob.remove());
        ob.Display();

    }

    
}
