
import java.util.Scanner;

public class Caalculate_A_kiPower_B {

    public static int Power(int b,int ans)
    {
        if(b==1)
        {
            return ans;
        }
        return ans * Power(b-1, ans);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(Power(B, A));
    }
    
}
