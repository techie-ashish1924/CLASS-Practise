import java.util.Scanner;

import javax.imageio.stream.IIOByteBuffer;

public class Nth_Fibbonaci {

    public static int Fibbonacci(int n)
    {
        if(n == 0 || n==1)
        {
            return n;
        }

        // tail recursion

        // int f1 = Fibbonacci(n-1);
        // int f2 = Fibbonacci(n-2);

        // Head Recursion
        
        return Fibbonacci(n-1) + Fibbonacci(n-2);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Fibbonacci(n));
    }
    
}
