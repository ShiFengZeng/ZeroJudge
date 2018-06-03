import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c092 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int num = 1;
		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null) {
			if (line.equals("END")) {
				int lastIndex = sb.lastIndexOf("\n");
				sb.delete(lastIndex - 1, sb.length() - 1);
				System.out.print(sb);
				break;
			} else {
				String[] str = line.split(",");
				double x = 0;
				double y = 0;

				int strLen = str.length;
				for (int i = 0; i < strLen; ++i) {
					String tempStr = "";
					int temp = 0;
					for (int j = 0; j < str[i].length(); ++j) {
						if (str[i].charAt(j) >= '0' && str[i].charAt(j) <= '9') {
							temp = temp * 10 + str[i].charAt(j) - '0';
						} else if (str[i].charAt(j) != '.') {
							tempStr += str[i].charAt(j);
						} 
					}
					if (tempStr.equals("N")) {
						y += temp;
					} else if (tempStr.equals("NE")) {
						x += temp * Math.sqrt(2) / 2;
						y += temp * Math.sqrt(2) / 2;
					} else if (tempStr.equals("E")) {
						x += temp;
					} else if (tempStr.equals("SE")) {
						x += temp * Math.sqrt(2) / 2;
						y -= temp * Math.sqrt(2) / 2;
					} else if (tempStr.equals("S")) {
						y -= temp;
					} else if (tempStr.equals("SW")) {
						x -= temp * Math.sqrt(2) / 2;
						y -= temp * Math.sqrt(2) / 2;
					} else if (tempStr.equals("W")) {
						x -= temp;
					} else if (tempStr.equals("NW")) {
						x -= temp * Math.sqrt(2) / 2;
						y += temp * Math.sqrt(2) / 2;
					}

				}
				sb.append(String.format("Map #%d\n", num));
				sb.append(String.format("The treasure is located at (%.3f,%.3f).\n", x, y));
				sb.append(String.format("The distance to the treasure is %.3f.\n\n", Math.sqrt(x * x + y * y)));

				num++;
			}
		}
	}
}