import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d123 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = 1;
		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			String input = br.readLine();
			String[] inputArr = input.split("[ ]+");
			int[] array = new int[n];
			int arrLen = array.length;
			for (int i = 0; i < arrLen; ++i) {
				array[i] = Integer.valueOf(inputArr[i]);
			}

			boolean isB2 = true;
			boolean[] isRepeat = new boolean[20000];

			for (int i = 0; i < arrLen; ++i) {
				for (int j = i; j < arrLen; ++j) {
					int sum = array[i] + array[j];
					if (isRepeat[sum]) {
						isB2 = false;
						break;
					} else {
						isRepeat[sum] = true;
					}
				}
			}

			if (isB2) {
				System.out.println(String.format("Case #%d: It is a B2-Sequence.", number));
			} else {
				System.out.println(String.format("Case #%d: It is not a B2-Sequence.", number));
			}
			number++;
		}
	}
}