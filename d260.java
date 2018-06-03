import java.util.Arrays;
import java.util.Scanner;

public class d260 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		long[] _4sides = new long[4];
		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < 4; ++j) {
					_4sides[j] = scan.nextLong();
				}

				Arrays.sort(_4sides);
				if (_4sides[0] == _4sides[3]) {
					System.out.println("square");
				} else if (_4sides[0] == _4sides[1] && _4sides[2] == _4sides[3]) {
					System.out.println("rectangle");
				} else if (_4sides[0] + _4sides[1] + _4sides[2] > _4sides[3]) {
					System.out.println("quadrangle");
				} else {
					System.out.println("banana");
				}
			}
		}
		scan.close();
	}
}