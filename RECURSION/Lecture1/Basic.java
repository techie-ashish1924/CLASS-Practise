import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Fact(n));

    }

    public static int Fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fn = Fact(n-1);

        return n*fn;
    }
    
}
