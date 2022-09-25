import java.util.Scanner;

public class String_Pattern_Print {

    public static void Pattern(String a)
    {
        for (int len = 1; len <= a.length(); len++) 
        {
            for (int j = len; j <= a.length(); j++) {
                int i = j - len;
                System.out.println(a.substring(i, j));
                
            }   
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        Pattern(a);
    }
    
}
