import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c672 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			// toHEX
			if (line.charAt(0) == '#') {
				System.out.println(toHEX(line));
			} else {// toRGB
				System.out.println(toRGB(line).toUpperCase());
			}
		}
	}

	public static String toHEX(String str) {
		String result = new String();

		String strTemp = str.substring(1, 3);
		result += Integer.valueOf(strTemp, 16) + " ";
		strTemp = str.substring(3, 5);
		result += Integer.valueOf(strTemp, 16) + " ";
		strTemp = str.substring(5, 7);
		result += Integer.valueOf(strTemp, 16) + " ";

		return result;
	}

	public static String toRGB(String str) {
		String result = new String("#");
		String[] strArrTemp = str.split("[ ]+");
		String temp = new String();

		for (int i = 0; i < 3; ++i) {
			temp = Integer.toHexString(Integer.valueOf(strArrTemp[i]));
			if (temp.length() != 2)
				result += "0" + temp;
			else
				result += temp;
		}

		return result;
	}
}
