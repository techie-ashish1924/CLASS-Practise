

import java.util.*;
public class Fibbonacci {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		// if(n==0)
		// {
		// 	System.out.println(n);
		// }
		// else if(n==1)
		// {
		// 	System.out.println(n);
		// }
		// else {

			
			int i=0;
			int f = 0;   // first value
			int s=1;     // second value
			int sum = 0;
			while(i<=n)
			{
				// System.out.println(f);
				sum = f+s;
				f=s;
				s=sum;
				i=i+1;
			
			}
			System.out.println(f);
		}
	}

// }
