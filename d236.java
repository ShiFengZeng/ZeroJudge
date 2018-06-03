public class d236 {

	public static void main(String[] args) {

		int a, b, c;

		for (a = 1; a < 500; a++) {
			for (b = a + 1; b < 500; ++b) {
				for (c = 500; c > 0; --c) {
					if (a * a + b * b == c * c) {
						if (a + b + c == 1000) {
							System.out.println(a * b * c);
						}
					}
				}
			}
		}
	}
}
