
public class d044 {

	public static void main(String[] args) {

		boolean[] isNotSelf_Numbers = new boolean[1000005];
		int sum = 0;
		int i = 1;
		StringBuilder sb = new StringBuilder();
		while (sum <= 1000000) {
			sum = cal(i);
			isNotSelf_Numbers[sum] = true;
			i++;
		}

		for (int j = 1; j <= 1000000; ++j) {
			if (!isNotSelf_Numbers[j]) {
				sb.append(j + "\n");
			}
		}
		System.out.print(sb);
	}

	public static int cal(int n) {
		int sum = n;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}