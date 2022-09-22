import java.util.Scanner;

public class Factorial_Tail_Recursion {

    // public static int f = 1;

    // tail recursion..........

    public static int Func(int n,int f)
    {
        if(n==0)
        {
            return f;
        }
        f = f*n;


        // f = f * n;

        return Func(n-1,f);
        

        
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Func(n,1));
        // System.out.println(f);
        // System.out.println(Fact);
    }
    
}
