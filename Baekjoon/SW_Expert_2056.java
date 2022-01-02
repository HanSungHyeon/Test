import java.util.Scanner;

public class SW_Expert_2056 {
	public static int arr[] = { 0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		String str;
		int tc;
		Scanner sc = new Scanner(System.in);
		tc = sc.nextInt();
		for (int i = 1; i <= tc; i++) {
			str = sc.next();
			int year = Integer.parseInt(str.substring(0, 4));
			int month = Integer.parseInt(str.substring(4, 6));
			int day = Integer.parseInt(str.substring(6, 8));
			if (month < 13 && month > 0 && day <= arr[month])
				System.out.println("#"+i+" "+getYear(year) + "/" + getMonth(month) + "/" + getDay(day));
			else
				System.out.println("#"+i+" -1");
		}
	}

	public static String getYear(int a) {
		return String.format("%04d", a);
	}

	public static String getMonth(int a) {
		return String.format("%02d", a);
	}

	public static String getDay(int a) {
		return String.format("%02d", a);
	}

}
