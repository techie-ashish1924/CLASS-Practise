package ComperatorVsComperable;

import java.util.Comparator;

public class CarComperatorPrice implements Comparator<Cars>{



    @Override
    public int compare(Cars o1, Cars o2) {
 
        return o2.price - o1.price;
    }
    
}
