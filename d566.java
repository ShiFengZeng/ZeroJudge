import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class d566 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			String[] name = new String[n + 1];
			String[] state = new String[n + 1];
			for (int i = 0; i < n; ++i) {
				name[i] = scan.next();
				state[i] = scan.next();
			}

			HashMap<Object, Object> map = new HashMap<Object, Object>();
			int spikeCount = 0;
			int ACCount = 0;
			for (int i = n - 1; i >= 0; --i) {
				if (!map.containsKey(name[i])) {
					if (state[i].equals("AC")) {
						spikeCount++;
						ACCount++;
					}
					map.put(name[i], state[i]);
				} else {
					if (!map.get(name[i]).equals("AC") && state[i].equals("AC")) {
						ACCount++;
						map.put(name[i], state[i]);
					}
				}
			}
			System.out.println(String.format("%d%s", spikeCount * 100 / ACCount, "%"));
		}
		scan.close();
	}
}
