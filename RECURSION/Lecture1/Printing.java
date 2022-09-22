import java.util.Scanner;

public class Printing {

    public static void Printing(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);

        Printing(n-1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printing(n);
    }
    
}
