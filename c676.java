import java.util.Random;

public class c676 {
	public static void main(String[] args) {

		Random rd = new Random();
		for (int i = 0; i < 100; ++i) {
			int a = rd.nextInt(1000000);
			int b = rd.nextInt(1000000);
			System.out.println(a + " " + b + " " + (a + b));
		}
	}
}
