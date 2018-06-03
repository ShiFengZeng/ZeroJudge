
public class d292 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int a = 2; a <= 200; ++a) {
			for (int b = 2; b < a; ++b) {
				for (int c = b + 1; c < a; ++c) {
					for (int d = c + 1; d < a; ++d) {
						if (a*a*a == b*b*b + c*c*c + d*d*d) {
							sb.append(String.format("Cube = %d, Triple = (%d,%d,%d)\n", a, b, c, d));
						}
						else if(a*a*a <= b*b*b + c*c*c + d*d*d) {
							break;
						}
					}
				}

			}
		}
		System.out.println(sb);
	}
}