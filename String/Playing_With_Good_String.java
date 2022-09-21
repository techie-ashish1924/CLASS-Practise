import java.util.Scanner;

public class Playing_With_Good_String {

    public static int Check(String a)
    {
        int i=0;
        int max = Integer.MIN_VALUE;
        int c = 0;
        while(i < a.length()) {
            
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
            {
                c++;
            }
            else{
                if(max < c)
                {
                    max = c;
                }
                c=0;
            }
            i++;
        }
        if(max > c)
            return max;
        return c;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(Check(a));

    }
    
}
