import java.util.Scanner;

public class Problem_3 {
	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		System.out.println("Enter positive integer: ");
		int a = sc.nextInt();
		if (a >= 1) {
			if (isEven(a)) {
				for (int i = 1; i < a; i++) {
					System.out.print(num + ", ");
					num = num + 2;
				}
			} 
			else {
				for (int i = 1; i <= a; i++) {
					System.out.print(num + ", ");
					num = num + 2;
				}
			}
		} 
		else {
			System.out.println("Enter valid integer...");
		}
	}

}
