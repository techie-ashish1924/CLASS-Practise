
import java.util.*;

public class Grade_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 75) {
			System.out.println("A");
		} else if (n >= 65 && n < 75) {
			System.out.println("B");
		} else if (n >= 55 && n < 65) {
			System.out.println("c");
		} else if (n >= 45 && n < 55) {
			System.out.println("D");
		}
//		int a = 89;
//		System.out.println(a++ + a);

	}

}
