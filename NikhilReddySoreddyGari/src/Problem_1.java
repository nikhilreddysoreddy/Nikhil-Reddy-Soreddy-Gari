import java.util.Scanner;

public class Problem_1 {
	
	private double a, b;

	Problem_1(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void calculate(String ope) {
		switch (ope) {
			case "add": {
				System.out.println("Result of (" + a + "+" + b + ") : " + (a + b));
				break;
			}
			case "sub": {
				System.out.println("Result of (" + a + "-" + b + ") : " + (a - b));
				break;
			}
			case "mul": {
				System.out.println("Result of (" + a + "*" + b + ") : " + (a * b));
				break;
			}
			case "div": {
				System.out.println("Result of (" + a + "/" + b + ") : " + (a / b));
				break;
			}
			default: {
				System.out.println("Enter valid operation...");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("SIMPLE CALCULATOR");
		System.out.println("Enter the first digit: ");
		double a = sc.nextDouble();
		System.out.println("Enter the second digit: ");
		double b = sc.nextDouble();
		System.out.println("Enter the type of operation(add,sub,mul,div): ");
		String opeString = sc.next();

		Problem_1 prob = new Problem_1(a, b);

		prob.calculate(opeString);

	}
}

