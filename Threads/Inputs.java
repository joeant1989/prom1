package thread;

import java.util.Scanner;

public class Inputs extends Thread {
	static int a,b;

	public void run() {
		
		System.out.println("Enter the First numbers: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter the second number: ");
		b = sc.nextInt();

	}

}
