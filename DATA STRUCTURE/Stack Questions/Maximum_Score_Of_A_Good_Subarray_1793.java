import java.util.Scanner;
import java.util.Stack;

public class Maximum_Score_Of_A_Good_Subarray_1793 {

    public static int Maximum_Score(int arr[], int k) {

        int max_score = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int h = arr[stack.pop()];
                int r = i;

                if (r - 1 >= k) {
                    if (stack.isEmpty()) {
                        // System.out.println("chala");
                        max_score = Math.max(max_score, h * r);
                    } else {
                        int l = stack.peek();
                        if (l + 1 <= k) {
                            max_score = Math.max(max_score, h * (r - l - 1));
                        }
                    }
                }
            }
            stack.push(i);
        }

        int r = arr.length;

        while (!stack.isEmpty()) {
            int h = arr[stack.pop()];

            if (r - 1 >= k) {
                if (stack.isEmpty()) {
                    max_score = Math.max(max_score, h * r);
                } else {
                    int l = stack.peek();
                    if (l + 1 <= k) {
                        max_score = Math.max(max_score, h * (r - l - 1));
                    }
                }
            }
        }
        return max_score;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(Maximum_Score(arr, k));
    }
}


