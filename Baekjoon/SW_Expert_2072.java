import java.util.Scanner;
import java.io.FileInputStream;

public class SW_Expert_2072 {
	public static int t, num1;
	public static int num = 0;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			for (int j = 0; j < 10; j++) {
				num1 = sc.nextInt();
				sum(num1);
			}
			System.out.println("#" + i + " " + num);
			num = 0;
		}
	}

	public static void sum(int a) {
		if (a % 2 != 0) 
			num += a;
	}

}
