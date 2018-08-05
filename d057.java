import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d057 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(" ");
			int[] intArr = new int[4];
			for (int i = 0; i < 4; ++i) {
				intArr[i] = Integer.valueOf(strArr[i]);
			}
			if (intArr[0] == intArr[1] && intArr[1] == intArr[2] && intArr[2] == intArr[3] && intArr[0] == 0)
				break;

			// X1, Y1, X2 , Y2 => intArr[0], intArr[1], intArr[2], intArr[3] => x1, y1, x2, y2
			if (intArr[0] == intArr[2] && intArr[1] == intArr[3]) {
				pw.println(0);
			} else if (Math.abs(intArr[0] - intArr[2]) == Math.abs(intArr[1] - intArr[3]) || intArr[0] == intArr[2]
					|| intArr[1] == intArr[3]) {
				pw.println(1);
			} else {
				pw.println(2);
			}
		}
		pw.close();
	}
}
