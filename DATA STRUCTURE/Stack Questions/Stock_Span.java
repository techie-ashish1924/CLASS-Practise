import java.util.*;
public class Stock_Span{


public static void Ans(int arr[])
{

	Stack<Integer> stack = new Stack<>();
	int ans[] = new int[arr.length];

	for(int i=0;i<arr.length;i++)
	{
		while(!stack.isEmpty() && arr[i] >= arr[stack.peek()])
		{
			stack.pop();

		}

		if(!stack.isEmpty())
		{
			ans[i] = i-stack.peek();
		}
		else{
			ans[i] = i+1;
		}
		stack.push(i);

	}

	for(int i=0;i<ans.length;i++)
	{
		System.out.print(ans[i] + " ");
	}

	System.out.print("END");
	

}
	public static void main(String args[])  {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		Ans(arr);
		// Your Code Here
	

	}

}

