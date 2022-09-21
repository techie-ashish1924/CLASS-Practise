import java.util.Scanner;

public class Lexiography_maximum {

    public static int Check(String a, String b)
    {
        if(a.length() > b.length())
        {
            return 1;
        }
        else if(a.length() < b.length())
        {
            return -1;
        }
        else{
            int i=0;
            int f =2;
            while (i <a.length()) {
                if(a.charAt(i) > b.charAt(i))
                {
                    return 1;
                }
                else if(a.charAt(i) < b.charAt(i))
                {
                    return -1;
                }
                else{
                    i++;
                }
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(Check(a, b));
    }
    
}
