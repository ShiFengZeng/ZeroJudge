import java.util.Scanner;

public class a866 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int[] evaluation = new int[6];
		double totalNum = 0;
		double sum = 0;
		double avg = 0;
		
		while (scan.hasNext()) {			
			num = scan.nextInt();

			if(num!=0) {
				evaluation[num]++;
				totalNum++;
				sum += num;
			}
			else {
				avg = sum / totalNum;
				for (int i = 5; i >= 1; --i) {
					System.out.print(String.format("%d (%2d) |", i, evaluation[i]));
					for (int j = 0; j < evaluation[i]; ++j) {
						System.out.print("=");
					}
					System.out.println();
				}
				System.out.println(String.format("Average rating: %.4f", avg));
				break;
			}
		}
		scan.close();
	}
}