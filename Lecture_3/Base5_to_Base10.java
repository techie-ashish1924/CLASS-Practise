
import java.util.*;
public class Base5_to_Base10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			sum = sum + rem * mul;
//			sum = sum * 10 + rem;
			n = n/10;
			mul = mul * 5;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
