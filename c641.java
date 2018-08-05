import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c641 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		String line;

		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(" ");
			int a = Integer.valueOf(strArr[0]);
			int b = Integer.valueOf(strArr[1]);
			int c = Integer.valueOf(strArr[2]);
			String kStr = br.readLine();
			String[] kStrArr = kStr.split(" ");
			int k1 = Integer.valueOf(kStrArr[0]);
			int k2 = Integer.valueOf(kStrArr[1]);
			int k3 = Integer.valueOf(kStrArr[2]);

			int p = b * c;
			int q = a * c;
			int r = a * b;

			int x, y, z = 0;
			for (int i = 0;; ++i) {
				if ((p * i) % a == k1) {
					x = p * i;
					break;
				}
			}
			for (int i = 0;; ++i) {
				if ((q * i) % b == k2) {
					y = q * i;
					break;
				}
			}
			for (int i = 0;; ++i) {
				if ((r * i) % c == k3) {
					z = r * i;
					break;
				}
			}

			int d = x + y + z;
			int t = a * b * c;
			int di = d / t;
			int max = Math.max(a, Math.max(b, c));

			for (int i =- di;; ++i) {
				int temp = d + t * i;
				if (temp > max) {
					pw.println(temp);
					break;
				}
			}
		}
		pw.flush();
	}

}
