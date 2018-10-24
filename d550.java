import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class d550 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			String[] nm = line.split(" ");
			int n = Integer.valueOf(nm[0]);
			int m = Integer.valueOf(nm[1]);
			Number[] numArr = new Number[n];

			for (int i = 0; i < n; ++i) {
				String[] inp = br.readLine().split(" ");
				numArr[i] = new Number(inp);
			}

			Comparator<Number> comp = new CompareObj();
			Arrays.sort(numArr, comp);
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < m; ++j)
					pw.print(numArr[i].arr[j] + " ");
				pw.println();
			}
		}
		pw.close();
	}

}

class Number {
	String[] arr;

	public Number(String[] arr) {
		this.arr = arr;
	}
}

class CompareObj implements Comparator<Number> {
	@Override
	public int compare(Number n1, Number n2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n1.arr.length; ++i) {
			if (Integer.valueOf(n1.arr[i]) < Integer.valueOf(n2.arr[i])) {
				return -1;
			}
			if (Integer.valueOf(n1.arr[i]) > Integer.valueOf(n2.arr[i])) {
				return 1;
			}
		}
		return 0;
	}
}