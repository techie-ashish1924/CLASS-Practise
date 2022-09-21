
import java.util.*;
public class Pattern3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n-1;
		int str = 1;
		while(row <= n)
		{
			int j=1;
			while(j<=space)
			{
				System.out.print(" ");
				j++;
			}
			int s= 1;
			while(s<=str)
			{
				System.out.print("*");
				s++;
			}
			System.out.println();
			
			row++;
			space--;
			str++;
		}
		
	}

}
