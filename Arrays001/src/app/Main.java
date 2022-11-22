package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 1, 1, 1, 4 };
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		while (ch != 11) {

			System.out.println("MAIN MENU\n");
			System.out.println("---------------\n");
			System.out.println("1::Check if array is sorted or not\n");
			System.out.println("2::Find max & second max\n");
			System.out.println("3::Find min & second min\n");
			System.out.println("4::Differnce between Max & min\n");
			System.out.println("5::Reverse array\n");
			System.out.println("6::Left Shift in array\n");
			System.out.println("7::right Shift in array\n");
			System.out.println("8::Find the position of Element in array\n");
			System.out.println("9::Find the Occurance of Element in array\n");
			System.out.println("10:search Element in array\n");
			System.out.println("11::Exit\n");
			System.out.println("---------------\n");
			System.out.println("Enter your choice (1-10) :\n");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				if (isSorted(arr)) {
					System.out.println("Array is Sorted\n");
				} else {
					System.out.println("Array is not Sorted\n");
				}
				break;

			case 2:
				System.out.println("Max Element is :" + findMaxTwo(arr)[0]);
				System.out.println("2nd Max Element is :" + findMaxTwo(arr)[1] + "\n");
				break;

			case 3:
				System.out.println("Min Element is :" + findMinTwo(arr)[0]);
				System.out.println("2nd Min Element is :" + findMinTwo(arr)[1] + "\n");
				break;

			case 4:
				System.out.println(
						"Difference between Max & min Element is :" + (findMaxTwo(arr)[0] - findMinTwo(arr)[0]) + "\n");
				break;

			case 5:
				reverseArray(arr);
				System.out.println("Reversed Array: ");
				for (int i = 0; i < arr.length; ++i) {
					System.out.print(arr[i] + ", ");
				}
				System.out.println("\n");
				break;

			case 6:
				leftshift(arr);
				System.out.println("Left Shiftted Array: ");
				for (int i = 0; i < arr.length; ++i) {
					System.out.print(arr[i] + ", ");
				}
				System.out.println("\n");
				break;

			case 7:
				rightshift(arr);
				System.out.println("Right Shifted Array: ");
				for (int i = 0; i < arr.length; ++i) {
					System.out.print(arr[i] + ", ");
				}
				System.out.println("\n");
				break;

			case 8:
				int key;
				System.out.println("Enter the Element: ");
				key = sc.nextInt();
				int n=findPosition(arr,key).length;
				System.out.println("Element found at positions : ");
				if (n!=0) {
					for(int i=0;i<n;++i)
					{
						System.out.print(findPosition(arr,key)[i]+",");
					}
					System.out.println();
				} else {
					System.out.println("Element does not exist in array" + "\n");
				}

				break;

			case 9:
				int key1;
				System.out.println("Enter the Element: ");
				key1 = sc.nextInt();
				System.out.println("Occurance of Element is :" + countFrequency(arr, key1) + "\n");
				break;

			case 10:
				int key2;
				System.out.println("Enter the Element: ");
				key2 = sc.nextInt();
				if (search(arr, key2)) {
					System.out.println("Element is found");
				} else {
					System.out.println("Element is not found");
				}
				break;

			case 11:
				break;

			default:
				System.out.println("Enter valid choice\n");
				break;
			}

		}

	}

	// Check if Array is sorted or not
	public static boolean isSorted(int[] arr) {
		int n = arr.length;
		boolean ans = false;
		boolean f = false;
		if (arr[0] < arr[n - 1]) {
			for (int i = 1; i < n; ++i) {
				if (arr[i] < arr[i - 1]) {
					f = true;
					break;
				}
			}
			if (f) {
				ans = false;
			} else {
				ans = true;
			}

		} else {
			for (int i = 1; i < n; ++i) {
				if (arr[i] > arr[i - 1]) {
					f = true;
					break;
				}
			}
			if (f) {
				ans = false;
			} else {
				ans = true;
			}
		}

		return ans;
	}

	// Find maximum & second maximum
	public static int[] findMaxTwo(int[] arr) {
		int[] a = new int[2];
		int max = arr[0];
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secMax = max;
				max = arr[i];
			}
			if (arr[i] > secMax && arr[i] < max) {
				secMax = arr[i];
			}
		}
		a[0] = max;
		a[1] = secMax;
		return a;
	}

	public static int[] findMinTwo(int[] arr) {
		int[] a = new int[2];
		int min = arr[0];
		int secMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secMin = min;
				min = arr[i];
			}
			if (arr[i] < secMin && arr[i] > min) {
				secMin = arr[i];
			}
		}
		a[0] = min;
		a[1] = secMin;
		return a;
	}

	public static void reverseArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length / 2; ++i) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}

	public static void leftshift(int[] arr) {
		int n = arr.length;
		int temp = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = temp;
	}

	public static void rightshift(int[] arr) {
		int n = arr.length;
		int temp = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}

	public static int [] findPosition(int[] arr, int key) {
//		int ans = -1;
//		int []arr1=new int[];
		int k=countFrequency(arr,key);
		int []arr1=new int[k];
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				arr1[cnt++]=i;
			}
		}
		return arr1;
	}

	public static int countFrequency(int[] arr, int key) {

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {

				cnt++;

			}
		}
		return cnt;
	}

	public static boolean search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;

			}
		}
		return false;
	}
}
