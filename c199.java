import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c199 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(" ");
			int len = strArr.length;
			int[] mountain = new int[len + 1];

			for (int i = 0; i < len; ++i) {
				mountain[i] = Integer.valueOf(strArr[i]);
			}
			int peakNum = 0;
			for (int i = 0; i < len - 2; ++i) {
				if (mountain[i + 1] > mountain[i]) {
					if (i + 2 >= len) {
						break;
					}
					while (mountain[i + 2] <= mountain[i + 1]) {
						if (mountain[i + 2] == mountain[i + 1]) {
							i++;
							if (i + 2 >= len) {
								break;
							}
						} else if (mountain[i + 2] < mountain[i + 1]) {
							peakNum++;
							i++;
							break;
						}

					}

				}
			}
			pw.println(peakNum);
		}
		pw.close();
	}

}