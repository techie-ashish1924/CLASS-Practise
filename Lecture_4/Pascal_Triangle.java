import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 0;
		int star = 1;
		while(row < n)
		{
			int val = 1;
			int i = 0;
			while(i<star)
			{
				System.out.print(val + " ");
				val = (val * (row - i)/(i+1));
				i++;
			}
			row++;
			star++;
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
