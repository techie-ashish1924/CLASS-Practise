import java.util.Scanner;

public class Palindrome {

    public static boolean Check(String a)
    {
        int lo = 0;
        int hi = a.length() - 1;

        while(lo <= hi)
        {
            if(a.charAt(lo) != a.charAt(hi))
            {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // String b = sc.nextLine();
    }
    
}
