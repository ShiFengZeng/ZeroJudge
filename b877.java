import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b877 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int[] ab = convertStringArrayToIntArray(br.readLine().split(" "));
		pw.println((ab[1] - ab[0] + 100) % 100);
		pw.close();
	}

	public static int[] convertStringArrayToIntArray(String[] source) {
		int[] result = new int[source.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = Integer.valueOf(source[i]);
		}
		return result;
	}
}
