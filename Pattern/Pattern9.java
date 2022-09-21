
import java.util.*;
//import java.util.Scanner;*;
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - n;
		int str = n;
		
		while(row <= 2*n -1)
		{
			int sp = 1;
			int st = 1;
			while(sp <= space)
			{
				System.out.print(" ");
				sp++;
			}
			while(st <= str)
			{
				System.out.print("*");
				st++;
				
			}
			System.out.println();
			row++;
			if(row <= n)
			{
				space += 2;
				str --;
			}
			else {
				space -= 2;
				str++;
			}
			
		}
	}

}
