

import java.util.*;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

public class Graph_Demo {

    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Graph_Demo(int v) {
        // initially edges 0.

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost); // v1 --> v2
        map.get(v2).put(v1, cost); // v2 --> v1
    }

    public boolean ContainsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean Containsvertex(int v1) {
        return map.containsKey(v1);
    }

    public int noofEdge() {
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

    public void display() {
        for (int key : map.keySet())

        {
            System.out.println(key + " " + map.get(key));
        }
    }

    public boolean haspath(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }
        visited.add(src);

        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = haspath(nbrs, des, visited);
                if (ans) {
                    return true;
                }
                // visited.add()
            }
        }
        visited.remove(src);
        return false;
    }

    public void PrintAllpath(int src, int des, HashSet<Integer> visited, String ans) {
        if (src == des) {
            System.out.println(ans);
            return;
        }
        visited.add(src);

        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                PrintAllpath(nbrs, des, visited, ans + src);

            }
        }
        visited.remove(src);

    }

    public boolean BFS(int src, int des) {
        HashSet<Integer> visited = new HashSet<>();

        Queue<Integer> q = new LinkedList<>();

         q.add(src);

        while (!q.isEmpty()) {

            // 1. Remove 

            int rv = q.poll();

            //2. If already visited then ignore kro.

            if (visited.contains(rv)) {
                continue;
            }

            // 3 Visited.
            visited.add(rv);

            // 4 Self work.
            if (rv == des) {
                return true;
            }

            // Add Neighbours

            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }

        }
        return false;

    }

    public boolean DFS(int src, int des) {
        HashSet<Integer> visited = new HashSet<>();

        // Queue<Integer> q = new LinkedList<>();

        Stack<Integer> st = new Stack<>();

        st.add(src);

        while (!st.isEmpty()) {

            // 1. Remove

            int rv = st.pop();

            // 2. If already visited then ignore kro.

            if (visited.contains(rv)) {
                continue;
            }

            // 3 Visited.
            visited.add(rv);

            // 4 Self work.
            if (rv == des) {
                return true;
            }

            // Add Neighbours

            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    st.add(nbrs);
                }
            }

        }
        return false;

    }

    public void BFT() {
        HashSet<Integer> visited = new HashSet<>();

        Queue<Integer> q = new LinkedList<>();

        for (int src : map.keySet()) {

            if (visited.contains(src)) {
                continue;
            }

            q.add(src);

            while (!q.isEmpty()) {

                // 1. Remove

                int rv = q.poll();

                // 2. If already visited then ignore kro.

                if (visited.contains(rv)) {
                    continue;
                }

                // 3 Visited.
                visited.add(rv);

                // 4 Self work.

                System.out.print(rv + " ");

                // Add Neighbours

                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }
            // return false;

        }

    }

    public void DFT() {
        HashSet<Integer> visited = new HashSet<>();

        // Queue<Integer> q = new LinkedList<>();

        Stack<Integer> st = new Stack<>();

        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }

            st.add(src);

            while (!st.isEmpty()) {

                // 1. Remove

                int rv = st.pop();

                // 2. If already visited then ignore kro.

                if (visited.contains(rv)) {
                    continue;
                }

                // 3 Visited.
                visited.add(rv);

                // 4 Self work.
                // if (rv == des) {
                //     return true;
                // }

                System.out.print(rv + " ");

                // Add Neighbours

                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.add(nbrs);
                    }
                }

            }
            // return false;

        }

    }
}


