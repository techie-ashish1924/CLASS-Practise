


import java.util.Scanner;

public class Graph_Client {


    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);

        Graph_Demo g = new Graph_Demo(7);
        g.AddEdge(1, 4, 6);
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);

        g.display();
    }
    
}
