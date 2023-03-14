package ComperatorVsComperable;

import java.util.Comparator;

public class CarClient {

    public static void main(String[] args) {

        Cars[] car = new Cars[5];

        car[0] = new Cars(200, 10, "White");
        car[1] = new Cars(1000, 20, "Black");
        car[2] = new Cars(345, 3, "Yellow");
        car[3] = new Cars(34, 89, "Grey");
        car[4] = new Cars(8907, 6, "Red");

        // System.out.println(car[0].price + " " + car[0].speed + " " + car[0].color);

        Display(car);
        BSort(car,new CarCompareterSpeed());
        System.out.println("After sorting on the bases of Speed..............\n");
        Display(car);
        System.out.println();
        BSort(car, new CarComperatorPrice());
        System.out.println("After sorting on the bases of price..............\n");
        Display(car);

    }

    public static void Display(Cars[] car) {

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

    }

    // public static <T extends Comparable>void BSort(T arr[])
    // {
    //     for(int turn = 1;turn < arr.length;turn++)
    //     {
    //         for (int i = 0; i < arr.length - turn; i++) {

    //             if(arr[i].compareTo(arr[i+1])>0)
    //             {
    //                 T temp = arr[i + 1];
    //                 arr[i + 1] = arr[i];
    //                 arr[i] = temp;
    //             }

    //         }
    //     }
    // }


    public static <T>void BSort(T arr[],Comparator<T> camp)
    {
    for(int turn = 1;turn < arr.length;turn++)
    {
    for (int i = 0; i < arr.length - turn; i++) {

    if(camp.compare(arr[i], arr[i+1]) > 0)
    {

        T temp = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = temp;

    }
    

    }
    }
    }

}
