package genericHeap;

import java.util.ArrayList;

public class Generic_Heap<T> {

    private ArrayList<Integer> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
        upheapify(list.size() - 1);
    }

    public void upheapify(int ci) {
        int pi = (ci - 1) / 2;
        if (list.get(pi) > list.get(ci)) {
            Swap(ci, pi);
            upheapify(pi);
        }

    }

    public void Swap(int i, int j) {
        T ith = list.get(i);
        T jth = list.get(j);
        list.set(i, jth);
        list.set(j, ith);
    }

    public T remove() {
        Swap(0, list.size() - 1);

        int rv = list.remove(list.size() - 1);
        downheapify(0);

        return rv;
    }

    private void downheapify(int pi) {

        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;

        int mini = pi;
        if (lci < list.size() && list.get(mini) > list.get(lci)) {
            mini = lci;
        }
        if (rci < list.size() - 1 && list.get(mini) > list.get(rci)) {
            mini = rci;
        }
        if (mini != pi) {
            Swap(mini, pi);
            downheapify(mini);
        }

    }

    public int min() {
        return list.get(0);
    }

    public int size() {
        return list.size();
    }

    public void Display() {
        System.out.println(list);
    }
    
}
