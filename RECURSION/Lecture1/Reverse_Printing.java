import java.util.Scanner;

public class Reverse_Printing {

    public static void Print(int n)
    {
        if(n==0)
        {
            return;
        }
        Print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         Print(n);

    }
    
}
