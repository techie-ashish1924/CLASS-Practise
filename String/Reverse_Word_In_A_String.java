import java.util.Scanner;

public class Reverse_Word_In_A_String {

    public static String Reverse(String a)
    {
        String res = "";
        String arr[] = a.split("\s+");
        for (int i = arr.length-1; i >= 0; i--) {
            res = res + arr[i] + " ";
        }
        return res.trim();
        // return "hello";
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(Reverse(a));
    }
    
}
