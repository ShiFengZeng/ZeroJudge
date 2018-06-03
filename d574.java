import java.util.Scanner;

public class d574 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			String abracadabra = scan.next();

			StringBuilder format = abracadabraFormat(abracadabra, n);
			int formatLength = format.length();
			int abracadabraLength = abracadabra.length();
			if (formatLength < abracadabraLength) {
				System.out.println(format);
			} else {
				System.out.println(abracadabra);
			}
		}
		scan.close();
	}

	static StringBuilder abracadabraFormat(String abracadabra, int n) {
		StringBuilder sb = new StringBuilder();
		abracadabra += " ";
		int charLength = 1;
		for (int i = 0; i < n; ++i) {
			if (abracadabra.charAt(i) == abracadabra.charAt(i + 1)) {
				charLength++;
			} else {
				sb.append(String.format("%d%s", charLength, abracadabra.charAt(i)));
				charLength = 1;
			}
		}
		return sb;
	}
}