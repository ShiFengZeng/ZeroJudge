import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d380_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String a;
		while ((a = br.readLine()) != null) {
			int aLen = a.length();
			String b = br.readLine();
			int bLen = b.length();

			int[] aArr = new int[aLen];
			int[] bArr = new int[bLen];
			int[] ans = new int[aLen + bLen + 1];
			int len = aLen + bLen - 1;

			for (int i = 0; i < aLen; ++i) {
				aArr[aLen - i - 1] = a.charAt(i) - '0';
			}
			for (int i = 0; i < bLen; ++i) {
				bArr[bLen - i - 1] = b.charAt(i) - '0';
			}

			for (int i = 0; i < aLen; ++i) {
				for (int j = 0; j < bLen; ++j) {
					ans[i + j] += (aArr[i]) * (bArr[j]);
				}

				for (int j = 0; j < len; j++) {
					if (ans[j] >= 10) {
						ans[j + 1] += ans[j] / 10;
						ans[j] %= 10;
					}
				}
			}

			while (ans[len] == 0) {
				len--;
				if (len < 0)
					break;
			}
			if (len < 0) {
				pw.println(0);
			} else {
				for (; len >= 0; --len) {
					pw.print(ans[len]);
				}
				pw.println();
			}
		}
		pw.close();
	}
}
