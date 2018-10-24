import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class d892 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] MN = line.split(" ");
		int M = Integer.valueOf(MN[0]);
		int N = Integer.valueOf(MN[1]);

		int[] words = new int[N];
		String[] w = br.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			words[i] = Integer.valueOf(w[i]);
		}

		int count = 0;
		LinkedList<Integer> machine = new LinkedList<>();
		for (int i = 0; i < N; ++i) {
			if (!machine.contains(words[i])) {
				if (machine.size() < M) {
					machine.add(words[i]);
					count++;
				} else {
					machine.removeFirst();
					machine.add(words[i]);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
