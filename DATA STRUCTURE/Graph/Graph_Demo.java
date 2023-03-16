

import java.util.HashMap;

public class Graph_Demo {

    
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
    
    public Graph_Demo(int v)
    {
        // initially edges 0.

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }
    
    public void AddEdge(int v1,int v2, int cost)
    {
        map.get(v1).put(v2, cost); // v1 --> v2
        map.get(v2).put(v1, cost); // v2 --> v1
    }

    public boolean ContainsEdge(int v1, int v2)
    {
        return map.get(v1).containsKey(v2);
    }

    public boolean Containsvertex(int v1) {
        return map.containsKey(v1);
    }

    public int noofEdge()
    {
        int sum = 0;

        for (int key : map.keySet()) {
            sum += map.get(key).size();
        }

        return sum / 2;
    }
    
    public void removeEdge(int v1, int v2) {

        if (ContainsEdge(v1, v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);

        }
    }
    
    public void removevertex(int v1) {

        for (int key : map.get(v1).keySet()) {
            // removeEdge(key, v1);
            map.get(key).remove(v1);
        }
        map.remove(v1);

    }

    public void display()
    {
        for (int key : map.keySet())

        {
            System.out.println(key + " " + map.get(key));
        }
    }
    

}
