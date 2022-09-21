import java.util.*;
public class Pattern6 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space  = n-1;
		int star = 1;
		while(row <= n)
		{
			int sp = 1;
			int st = 1;
			while(sp <= space)
			{
				System.out.print(" ");
				sp++;
				
			}
			while(st <= star)
			{
				System.out.print("*");
				st++;
			}
			row++;
			space--;
			star += 2;
			System.out.println();
		}
	}

}
