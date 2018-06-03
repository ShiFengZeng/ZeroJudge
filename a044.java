import java.util.Scanner;

public class a044 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			// ¤½¦¡ (N*(N*N+5))/6 +1

			int i = scan.nextInt();
			int result = (i * (i * i + 5)) / 6 + 1;
			System.out.println(result);
		}
	}
}
