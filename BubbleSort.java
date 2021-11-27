package HomeWork_L3;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Array size = ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("*** Array ***");

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Element [" + i + "] =");
			arr[i] = scan.nextInt();
		}
        
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Element [" + i + "] = " + arr[i] + "; ");

		}

		scan.close();
	}

}
