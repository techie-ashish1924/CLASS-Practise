package ComperatorVsComperable;

import java.util.Comparator;

public class CarCompareterSpeed implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {

        return o1.speed - o2.speed;


    }


    
}
