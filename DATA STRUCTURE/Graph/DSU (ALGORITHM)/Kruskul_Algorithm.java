import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Kruskul_Algorithm {


    HashMap<Integer, HashMap<Integer, Integer>> map;


    public Kruskul_Algorithm(int v)
    {
        this.map = new HashMap<>();

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }
    
    public void addEdge(int v1,int v2, int cost)
    {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public class EdgePair {

        int e1;
        int e2;
        int cost;

        public EdgePair(int e1, int e2, int cost) {
            this.cost = cost;
            this.e1 = e1;
            this.e2 = e2;
        }

        @Override
        public String toString()
        {
            return e1 + " - " + e2 + " @ " + cost;
        }
    }
    

    public ArrayList<EdgePair> getallEdge()
    {
        ArrayList<EdgePair> list = new ArrayList<>();

        for (int e1 : map.keySet()) {
            for (int e2 : map.get(e1).keySet()) {

                EdgePair eg = new EdgePair(e1, e2, map.get(e1).get(e2));

                list.add(eg);
            }
        }

        return list;
    }

    public void Kruskals()
    {

        int ans = 0;
        DSU ds = new DSU();

        for (int k : map.keySet()) {
            ds.CreateSet(k);
        }

        ArrayList<EdgePair> ll = getallEdge();

        Collections.sort(ll, new Comparator<EdgePair>() {

            @Override

            public int compare(EdgePair o1, EdgePair o2) {
                return o1.cost - o2.cost;
            }

        });

        for (EdgePair edge : ll) {
            int e1 = edge.e1;
            int e2 = edge.e2;

            int re1 = ds.find(e1);
            int re2 = ds.find(e2);

            if (re1 == re2) {
                continue;

            } else {
                System.out.println(edge);
                ans += edge.cost;
                ds.Union(re1, re2);
            }

        }
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Kruskul_Algorithm ks = new Kruskul_Algorithm(n);

        int m = sc.nextInt();

        for(int i=0;i<m;i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();

            ks.addEdge(v1, v2, cost);
        }

        ks.Kruskals();
    }
    

    
}
