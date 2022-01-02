import java.util.Scanner;

public class SW_Expert_2058 {

	public static void main(String[] args) {
		int answer = 0, n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}
		System.out.println(answer);
	}
}
