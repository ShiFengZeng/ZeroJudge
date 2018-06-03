import java.util.Scanner;

public class a004_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//ºC
		while (scanner.hasNext()) {
			int i = scanner.nextInt();
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				System.out.println("¶|¦~");
			} else {
				System.out.println("¥­¦~");
			}
		}
		scanner.close();
	}
}
