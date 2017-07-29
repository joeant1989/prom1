import java.util.Scanner;

public class Log extends Login {
	static String a, b;
	static int n=0;
	public static void main(String[] args) {
		reg();
		login();
		check();
		System.out.println("Do you want to login again(y/n)?");
		Scanner sc = new Scanner(System.in);
		a = sc.next();
do {

		if (a.equalsIgnoreCase("y")) {
			login();
			check();
			System.out.println("Do you want to login again(y/n)?");
			a = sc.next();
			

		}if(a.equalsIgnoreCase("n")) {
			System.out.println("Do you want to register(y/n)?");
			b =sc.next();
			if(b.equalsIgnoreCase("y")) {
				reg();
				login();
				check();
				System.out.println("Do you want to login again(y/n)?");
				a=sc.next();
			}
			if(b.equalsIgnoreCase("n")) {
				System.out.println("***********THANK YOU**************");
				break;
			}
			}
			
		
	}while(n<100);
}
}
