import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b837 {

	public static void main(String[] args) throws IOException {
		HashSet<Integer> hs = new HashSet<Integer>();
		int[] FibonacciName = new int[31];

		FibonacciName[0] = 0;
		FibonacciName[1] = 1;
		hs.add(FibonacciName[0]);
		hs.add(FibonacciName[1]);

		for (int i = 2; i <= 30; ++i) {
			FibonacciName[i] = FibonacciName[i - 1] + FibonacciName[i - 2];
			hs.add(FibonacciName[i]);
		}

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String nStr;
		while ((nStr=br.readLine()) != null) {
			int n = Integer.valueOf(nStr);

			for (int k = 0; k < n; ++k) {
				String ABStr=br.readLine();
				String[] AB=ABStr.split(" ");
				int A = Integer.valueOf(AB[0]);
				int B = Integer.valueOf(AB[1]);
				int count = 0;

				for (int j = Math.min(A, B); j <= Math.max(A, B); ++j) {
					if (j == 1) {
						System.out.println(j);
						System.out.println(j);
						count += 2;
					} else {
						if (hs.contains(j)) {
							System.out.println(j);
							count++;
						}
					}
				}

				System.out.println(count);
				int n_1 = n - 1;
				if (k != n_1)
					System.out.println("------");
			}
		}
	}
}
