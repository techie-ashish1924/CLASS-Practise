

import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - n;
		int str = n;
		
		while(row <= n )
		{
			int sp = 1;
			while(sp <= space)
			{
				System.out.print(" ");
				sp++;
			}
			int st = 1;
			while(st <= str)
			{
				System.out.print("*");
				st++;
			}
			row++;
			System.out.println();
			space++;
			str--;
		}
		
	}

}
