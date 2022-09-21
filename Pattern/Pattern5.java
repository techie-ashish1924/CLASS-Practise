
import java.util.*;
//import java.util.Scanner;*;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - n;
		int str = n;
		
		while(row <= n)
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
			space += 2;
			str --;
		}
	}

}
