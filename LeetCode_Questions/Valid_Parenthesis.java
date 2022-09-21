

import java.util.*;
public class Valid_Parenthesis {

	
	public boolean Check_Parenthesis(String s)
	{
		Stack<Character> stacks = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')' && !stacks.isEmpty() && stacks.peek() == '(')
            {
                stacks.pop();
            }
            else if(s.charAt(i) == '}' && !stacks.isEmpty() && stacks.peek() == '{')
            {
                stacks.pop();
            }
            else if(s.charAt(i) == ']' && !stacks.isEmpty() && stacks.peek() == '[')
            {
                stacks.pop();
            }
            else{
                stacks.push(s.charAt(i));
            }
        }
        return stacks.isEmpty();
   
	}
	public static void main(String[] args) {
		
//			Scanner ob1 = new Scanner(System.in);
//			String s = ob1.next();
//			Valid_Parenthesis ob = new Valid_Parenthesis();
//			System.out.println(ob.Check_Parenthesis(s));
		
		
		try (Scanner ob1 = new Scanner(System.in)) {
			String s = ob1.next();
			Valid_Parenthesis ob = new Valid_Parenthesis();
			System.out.println(ob.Check_Parenthesis(s));
			}
			}
		
		
	}

