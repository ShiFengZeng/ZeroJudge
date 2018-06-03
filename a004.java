import java.util.Scanner;

public class a004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		//快
		while (scanner.hasNext()) {
			int i = scanner.nextInt();
			if (i % 4 == 0) {
				if (i % 100 == 0) {
					if (i % 400 == 0) {
						System.out.println("閏年");
					} else {
						System.out.println("平年");
					}
				} else {
					System.out.println("閏年");
				}
			} else {
				System.out.println("平年");
			}			
		}
		scanner.close();
	}
}
