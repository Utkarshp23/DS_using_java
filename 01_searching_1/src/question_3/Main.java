package question_3;

import java.util.Scanner;

public class Main {
	public static int[] binary_search(int[] a, int k) {
		int n = a.length;
		int l = 0, h = n - 1, m;
		int cnt = 0;
		int[] ans = { 0, 0 };
		while (l <= h) {
			m = (l + h) / 2;
//			System.out.println(m + " " + a[m]);
			if (a[m] == k) {
				ans[0] = 1;
			} else if (a[m] < k) {
				l = m + 1;
			} else {
				h = m - 1;
			}
			cnt++;
		}

		ans[0] = -1;
		ans[1] = cnt;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 5, 7, 8, 10, 11, 15, 18, 23 };
		int k;
		System.out.println("Enter element to search:");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		int[] ans = binary_search(arr, k);
		System.out.println("Presence of element is: " + ans[0]);
		System.out.println("Iterations to find element are: " + ans[1]);

	}
}
