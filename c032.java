import java.util.Scanner;

public class c032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		String str = "";
		System.out.println("PERFECTION OUTPUT");
		while (scan.hasNext()) {
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("END OF OUTPUT");
				break;
			}
			str = determine(num);
			System.out.println(String.format("%5d  %s", num, str));

		}
		scan.close();
	}

	public static String determine(int num) {
		int sum = 0;
		String str = "";

		for (int i = 1; i < num; ++i) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (sum == num) {
			str = "PERFECT";
		} else if (sum > num) {
			str = "ABUNDANT";
		} else {
			str = "DEFICIENT";
		}
		return str;
	}
}