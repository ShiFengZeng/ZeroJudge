import java.util.Scanner;

public class a286 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year, month, day;
		int n;
		int y, m, d;
		int girlNumber;
		int suitorNumber;			
		
		while (scan.hasNext()) {
			int min = 10, closerNumber = 0;
			
			year = scan.nextInt();
			month = scan.nextInt();
			day = scan.nextInt();
			girlNumber = calculate(year) + calculate(month) + calculate(day);
			while (girlNumber >= 10)
				girlNumber = calculate(girlNumber);

			n = scan.nextInt();
			for (int i = 0; i < n; ++i) {
				
				y = scan.nextInt();
				m = scan.nextInt();
				d = scan.nextInt();
				suitorNumber = calculate(y) + calculate(m) + calculate(d);
				while (suitorNumber >= 10)
					suitorNumber = calculate(suitorNumber);

				if (Math.abs(girlNumber - suitorNumber) < min) {
					min = Math.abs(girlNumber - suitorNumber);
					closerNumber = i + 1;
				}				
			}
			System.out.println(closerNumber);
		}

		scan.close();
	}

	public static int calculate(int number) {
		int sum = 0;

		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}