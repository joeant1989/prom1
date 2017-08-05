package thread;

public class Process extends Inputs {
	static int sum;

	public void run() {
		sum = Inputs.a + Inputs.b;
		System.out.println("THE SUM = " + sum);

	}

	public static void main(String[] args) throws InterruptedException {
		Inputs x = new Inputs();
		Process y = new Process();
		x.start();
		x.join();
		y.start();

	}

}
