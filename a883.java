import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a883 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] theTimeIsWorking = new boolean[24];
		boolean isHappy = true;

		for (int T = 0; T < 3; ++T) {
			String[] strArr = br.readLine().split(" ");

			int start = Integer.valueOf(strArr[0]);
			int end = Integer.valueOf(strArr[1]);

			for (int i = start; i <= end; ++i) {
				if (theTimeIsWorking[i]) {
					isHappy = false;
					break;
				} else {
					theTimeIsWorking[i] = true;
				}
			}
			if (!isHappy)
				break;
		}
		if (isHappy) {
			System.out.println("Happy");
		} else {
			System.out.println("QQ");
		}
	}

}