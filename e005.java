import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class e005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		while ((line = br.readLine()) != null) {
			String[] coordinates = line.split(" ");
			int x1 = Integer.valueOf(coordinates[0]);
			int y1 = Integer.valueOf(coordinates[1]);
			int x2 = Integer.valueOf(coordinates[2]);
			int y2 = Integer.valueOf(coordinates[3]);
			int x3 = Integer.valueOf(coordinates[4]);
			int y3 = Integer.valueOf(coordinates[5]);

			if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0 && x3 == 0 && y3 == 0) {
				break;
			}

			int dx1 = Math.abs(x1 - x2);
			int dy1 = Math.abs(y1 - y2);

			int dx2 = Math.abs(x1 - x3);
			int dy2 = Math.abs(y1 - y3);

			int dx3 = Math.abs(x2 - x3);
			int dy3 = Math.abs(y2 - y3);

			int count = 0;

			if (dx1 != 0 && dy1 != 0) {
				count += gcd(dx1, dy1);
			} else {
				count += dx1 == 0 ? dy1 : dx1;
			}
			if (dx2 != 0 && dy2 != 0) {
				count += gcd(dx2, dy2);
			} else {
				count += dx2 == 0 ? dy2 : dx2;
			}
			if (dx3 != 0 && dy3 != 0) {
				count += gcd(dx3, dy3);
			} else {
				count += dx3 == 0 ? dy3 : dx3;
			}
			pw.println(count);
		}
		pw.close();
	}

	static int gcd(int a, int b) {
		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
