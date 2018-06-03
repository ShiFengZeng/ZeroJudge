
public class d237 {

	public static void main(String[] args) {
		long sum = 0;

		for (int i = 2; i < 2000000; ++i) {
			boolean isPrime = true;

			for (int j = 2; j <= Math.sqrt(i); ++j) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
