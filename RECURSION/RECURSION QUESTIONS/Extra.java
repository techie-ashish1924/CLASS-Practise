import java.util.Scanner;

public class Extra {

    public static void Break(String a)
    {

        // String arr[] = a.split(" ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }



        int f=0;
        int l = 0;
        int sum = 0;
        int s_l = 0;
        for ( ; l < a.length(); l++) 
        {
            sum++;
            if(a.charAt(l) == ' ')
            {
                
                if(sum <= 11)
                {
                    s_l = l;
                    // System.out.println(a.substring(f, s_l));
                    // sum = 0;
                    // f=s_l;
                }
                else{
                    System.out.println(a.substring(f, s_l+1));
                    sum = l-s_l;
                    f = s_l+1;
                    s_l = l;
                }
                

            }
            
        }

        System.out.println(a.substring(f, s_l));
        System.out.println(a.substring(s_l+1, l));
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // String a = sc.next();
        String a = "the quick brown fox jumps over the lazy";
        Break(a);
    }
    
}
