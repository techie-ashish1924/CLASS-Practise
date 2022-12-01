import java.util.Scanner;
import java.util.Stack;

public class Form_minimum_number_from_given_Sequence {


    public static String Format(String s)
    {
        int ans[] = new int[s.length() + 1];
        int count = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) 
        {

            if(i == s.length() || s.charAt(i) == 'I')
            {
                ans[i] = count++;

                while(stack.isEmpty())
                {
                    ans[stack.pop()] = count++;
                }
            }
            else{
                stack.push(i);
            }
        
        
        }

        String str = "";
        for(int val : ans)
        {
            str += val;
        }

        return str;

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = "DDIDDDI";

        System.out.println(Format(str));
    }
    
}
