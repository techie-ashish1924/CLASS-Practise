// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.PriorityQueue;
import java.util.*;

public class Prims {


    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();

    public Prims(int v)
    {
        for(int i=1;i<=v;i++)
        {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1,int v2,int cost)
    {
        map.get(v1).put(v2, cost);   // v1 --> v2
        map.get(v2).put(v1, cost);   // v2 --> v1

    }

   

    public class PrimsPair{

        int vtx;
        int acqvtx;   // aquire vertex
        int cost;

        public PrimsPair(int vtx,int acqvtx,int cost)
        {
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;

        }

        @Override

        public String toString()
        {
            return this.vtx + " " + this.acqvtx + " @ " + this.cost;
        }
    }

    public void PrimsAlgo()
    {
        int count = 0;
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

            @Override
            public int compare(Prims.PrimsPair o1, Prims.PrimsPair o2) {
                // TODO Auto-generated method stub
                return o1.cost - o2.cost;
            }
            
           
        });

        pq.add(new PrimsPair(1, 1, 0));
        
        HashSet<Integer> visited = new HashSet<>();

        while(!pq.isEmpty())
        {
            PrimsPair rp = pq.poll();

            if(visited.contains(rp.vtx))
            {
                continue;
            }

            visited.add(rp.vtx);

            System.out.println(rp);
            count += rp.cost;

            for(int nbrs : map.get(rp.vtx).keySet())
            {
                if(!visited.contains(nbrs))
                {
                    PrimsPair np = new PrimsPair(nbrs, rp.vtx, map.get(rp.vtx).get(nbrs));
                    pq.add(np);
                }
            }
        }

        // return count;

    }
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
     

        Prims p = new Prims(n);
        int m = sc.nextInt();

        for(int i=0;i<m;i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            p.AddEdge(v1, v2, cost);
        }

        // System.out.println(p.PrimsAlgo());

        p.PrimsAlgo();
    }
    
}
