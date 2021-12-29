import java.util.Scanner;

public class Baekjoon_4101 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if(num1 == 0 && num2 == 0)
				break;
			else if (num1 > num2)
				System.out.println("Yes");
			else
				System.out.println("No");
			
		}
	}
}
