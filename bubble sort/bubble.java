package sort;

import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) throws InterruptedException {
		int i, j, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int a[] = new int[50];
		System.out.println("Enter the elements : ");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before sorting...");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		Thread.sleep(5000);
		System.out.println("After sorting....");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

}
