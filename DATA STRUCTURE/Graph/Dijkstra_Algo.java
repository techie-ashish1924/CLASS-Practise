
import java.util.*;

public class Dijkstra_Algo {



    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Dijkstra_Algo(int v) {
        // initially edges 0.

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost); // v1 --> v2
        map.get(v2).put(v1, cost); // v2 --> v1
    }


    public class DijkstraPair {

        int vtx;
        String acq_path;
        int cost = 0;

        public DijkstraPair(int vtx, String acq_path, int cost) {
            this.vtx = vtx;
            this.acq_path = acq_path;
            this.cost = cost;
        }

        @Override
        public String toString()
        {
            return this.vtx + " vai " + this.acq_path + " @ " + this.cost;
        }
    }
    

    public void DijkastraAlgo()
    {
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

            @Override

            public int compare(DijkstraPair o1, DijkstraPair o2) {
                // TODO Auto-generated method stub

                return o1.cost - o2.cost;
            }

        });

        Set<Integer> visited = new HashSet<>();

        pq.add(new DijkstraPair(1, "1", 0));

        while (!pq.isEmpty()) {
            DijkstraPair rp = pq.remove();

            if (visited.contains(rp.vtx)) {
                continue;
            }

            visited.add(rp.vtx);

            System.out.println(rp);

            for (int nbrs : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbrs)) {
                    int cost = rp.cost + map.get(rp.vtx).get(nbrs);

                    pq.add(new DijkstraPair(nbrs, rp.acq_path + nbrs, cost));
                }
            }
        }

    }
    

    public static void main(String[] args) {

        Dijkstra_Algo g = new Dijkstra_Algo(8);
        
        g.AddEdge(1, 4, 6);
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);

        g.DijkastraAlgo();
    }
    
}
