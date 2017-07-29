import java.util.Scanner;

public class Register {
	static String password, username;
	static String Firstname;
	static String Lastname;
	static int age;
	static Scanner sc = new Scanner(System.in);

	static void reg() {
		System.out.println("Enter the first name: ");
		Firstname = sc.next();
		System.out.println("Enter the last name: ");
		Lastname = sc.next();
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		System.out.println("Register your username: ");
		username = sc.next();
		System.out.println("Enter a password");
		password = sc.next();
		System.out.println("YOU HAVE SUCCESSFULLY REGISTERED!!");
		System.out.println("************************************");
	}
}
