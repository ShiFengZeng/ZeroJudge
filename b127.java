import java.util.Scanner;

public class b127 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		long[] sideLen = new long[46];
		sideLen[0] = 1;
		sideLen[1] = 1;
		for (int i = 2; i <= 45; i++) {
			sideLen[i] = sideLen[i - 1] + sideLen[i - 2];
		}
		while (scan.hasNext()) {
			n = scan.nextInt();
		
			System.out.println(sideLen[n]);
		}
		scan.close();
	}
}
