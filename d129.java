public class d129 {

	public static void main(String[] args) {
		long[] uglyName = new long[1501];
		uglyName[1] = 1;
		int n2 = 1, n3 = 1, n5 = 1;

		for (int i = 2; i <= 1500; ++i) {
			while (uglyName[n2] * 2 <= uglyName[i - 1])
				n2++;
			while (uglyName[n3] * 3 <= uglyName[i - 1])
				n3++;
			while (uglyName[n5] * 5 <= uglyName[i - 1])
				n5++;

			uglyName[i] = Math.min(uglyName[n2] * 2, Math.min(uglyName[n3] * 3, uglyName[n5] * 5));
		}
		System.out.println("The 1500'th ugly number is " + uglyName[1500] + ".");
	}
}