
import java.util.*;
public class Index_Find {
	
	public static int Index(int arr[] , int ele)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == ele)
			{
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int ele = sc.nextInt();
		System.out.println("index is : ");
		System.out.println(Index(arr,ele));
		
		

	}

}
