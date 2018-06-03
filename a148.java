import java.util.Scanner;

public class a148 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			double totalScore = 0;

			for (int i = 0; i < n; ++i) {
				double score = scan.nextInt();
				totalScore += score;
			}
			double avgScore = totalScore / n;
			System.out.println(avgScore > 59 ? "no" : "yes");
		}
	}
}
