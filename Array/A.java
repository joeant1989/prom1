package array;

import java.util.ArrayList;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		int total = 0;
		String z;
		Scanner sc = new Scanner(System.in);
		do {
			ArrayList list = new ArrayList();
			String a = null;

			System.out.println("Enter the number of Students : ");
			int n = sc.nextInt();
			System.out.println("Enter the no. of subjects : ");
			int m = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.println("Enter student" + i + " name : ");
				a = sc.next();
				for (int j = 1; j <= m; j++) {
					System.out.println("Enter the student mark" + j);
					int b = sc.nextInt();
					list.add(b);
					total = b + total;
				}

				float avg = total;
				avg = avg / m;
				System.out.println("****MARKS SHEET****");
				System.out.println("Name : " + a);
				System.out.println("Total marks : " + total);
				System.out.println("Average : " + avg);
				System.out.println("Marks obtained : " + list);
				if (avg < 50) {
					System.out.println("Status : FAIL");
				} else {
					System.out.println("Status : PASS");

				}
			}
			System.out.println("Do you want to continue(Y/N)?");
			z = sc.next();
		} while (z.equalsIgnoreCase("Y"));
	}
}