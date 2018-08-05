import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d166 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(" ");

			if (strArr[0].equals("-1"))
				break;
			int strLen = strArr.length;

			int[] input = new int[strLen];
			int[] result = new int[strLen];

			for (int i = 0; i < strLen; ++i) {
				input[i] = Integer.valueOf(strArr[i]);
			}

			int index = 0;
			for (int i = 0; i < strLen; ++i) {
				int count = 0;
				index = input[i];
				for (int j = 0; j < strLen; ++j) {
					if (result[j] == 0) {
						count++;
					}
					if (index == 0) {
						while (result[index] != 0) {
							index++;
						}
						result[index] = i + 1;
						break;
					} else if (count == index) {
						while (result[j+1] != 0) {
							j++;
						}
						result[j + 1] = i + 1;
						break;
					}
				}
			}
			for (int i = 0; i < strLen; ++i) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
		}
	}
}