import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a520 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			int spaceCount = 0;
			int maxSpaceCount = 0;
			int strLen = line.length();
			for (int i = 0; i < strLen; ++i) {
				if (line.charAt(i) == ' ') {
					spaceCount++;
				} else {
					maxSpaceCount = Math.max(maxSpaceCount, spaceCount);
					spaceCount = 0;
				}
			}
			int count = 0;
			while (maxSpaceCount > 1) {
				count++;
				maxSpaceCount = maxSpaceCount / 2 + maxSpaceCount % 2;
			}
			System.out.println(count);
//			System.out.println((int) Math.ceil((Math.log(maxSpaceCount) / Math.log(2))));
		}

	}
}