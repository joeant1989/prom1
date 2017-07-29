
public class Login extends Register {
	static String usr;
	static String pass;
	

	static void login() {
		System.out.println("USERNAME :");
		usr = sc.next();
		System.out.println("PASSWORD :");
		pass = sc.next();

	}

	static void check() {
		if (usr.equals(username)) {
			if (pass.equals(password)) {
				System.out.println("Login Successfull");
				System.out.println("***********************************");
				System.out.println("***** WELCOME " + username + "*****");
				System.out.println("First name : " + Firstname);
				System.out.println("Last name : " + Lastname);
				System.out.println("***********************************");
			} else {
				System.out.println("LOGIN FAILED");
			}
		} else {
			System.out.println("LOGIN FAILED");
		}
	}
}
