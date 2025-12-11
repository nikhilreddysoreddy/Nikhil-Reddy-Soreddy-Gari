import java.util.Scanner;

public class Problem_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=1;
		System.out.println("Enter any positive: ");
		int a=sc.nextInt();
		if(a>=1) {
			if(a==1) {
				System.out.println(1);
			}
			else {
				for(int i=1;i<=a;i++) {
					System.out.print(num+", ");
					num=num+2;
				}
			}
		}
		else {
			System.out.println("Enter valid integer..");
		}
	}
}
