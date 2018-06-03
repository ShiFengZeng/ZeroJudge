import java.util.Scanner;

public class d226 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int v, t;

		while (scan.hasNext()) {
			v = scan.nextInt();
			t = scan.nextInt();

			//  S=1/2*a*(t^2)
			//  V=at
			//  a=V/t
			//  S=1/2*a*((2t)^2)=2*v*t
			
			System.out.println(2*v*t);
		}
		scan.close();
	}
}