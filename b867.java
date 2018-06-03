import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b867 {
	private static int INDEX = 1;
	private static int COUNT = 1;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		String prev = "{}";

		while ((input = br.readLine()) != null) {
			prev = analysis(input, prev);

		}
		System.out.println(prev);
	}

	public static String insert(String[] strArr) {
		String result = "";
		result += strArr[1] + ":";
		result += strArr[2];
		return result;
	}

	public static String newJSONObject(String key) {
		String result = "";
		result += key + ":{}";
		return result;
	}

	public static String analysis(String input, String prev) {
		String[] analysisStr = input.split("[ ]+");
		String result = "";

		if (analysisStr.length == 3) {
			if (analysisStr[2].equals("newJSONObject")) {
				int p = prev.lastIndexOf('{');
				if (p >= 0) {
					if (INDEX == 1) {
						prev = prev.substring(0, INDEX - COUNT) + "{";
						result += prev + newJSONObject(analysisStr[1]);
						for (int i = 0; i < COUNT; ++i)
							result += "}";
						INDEX = result.length();
					}

					else {
						prev = prev.substring(0, INDEX - COUNT);

						if (prev.charAt(prev.length() - 1) == '{') {
							result = prev + newJSONObject(analysisStr[1]);
							for (int i = 0; i < COUNT; ++i)
								result += "}";
						}

						else {
							result = prev + "," + newJSONObject(analysisStr[1]);
							for (int i = 0; i < COUNT; ++i)
								result += "}";
						}
						INDEX = result.length();
					}
					COUNT++;
				}
			} else {
				int p = prev.lastIndexOf('{');
				if (p >= 0) {
					if (INDEX == 1) {
						prev = prev.substring(0, INDEX - COUNT) + "{";
						result += prev + insert(analysisStr);
						for (int i = 0; i < COUNT; ++i)
							result += "}";
						INDEX = result.length();
					}

					else {
						prev = prev.substring(0, INDEX - COUNT);
						if (prev.charAt(prev.length() - 1) == '{') {
							result = prev + insert(analysisStr);
							for (int i = 0; i < COUNT; ++i)
								result += "}";
						} else {
							result = prev + "," + insert(analysisStr);
							for (int i = 0; i < COUNT; ++i)
								result += "}";
						}

						INDEX = result.length();
					}
				}
			}

		} else {
			result = prev;

			COUNT--;
		}

		return result;
	}
}