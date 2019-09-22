import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class e390 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String input;
		while ((input = br.readLine()) != null) {
			String string = getBig5HexString(input);
			if (string.endsWith("5c") && string.length() == 4) {
				pw.println("Yes");
			} else {
				pw.println("No");
			}
		}
		pw.close();
	}

	public static String getBig5HexString(String source) throws UnsupportedEncodingException {
		String result = "";

		byte[] bs = source.getBytes("BIG5");
		for (byte b : bs) {
			 int i = b & 0xff;
			 result += Integer.toHexString(i);
		}
		return result;
	}
}
