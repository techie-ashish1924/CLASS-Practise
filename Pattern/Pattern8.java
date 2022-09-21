import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 0;
		
		while(row <= 2*n -1)
		{
			int i = 1;
			while(i <= star)
			{
				System.out.print("*");
				i++;
			}
			
			// MIRRORING................
			if(row < 5)
			{
				star++;
			}
			else {
				star--;
			}
			row++;
			System.out.println();
			
			
		}
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

	}

}
