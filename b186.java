import java.util.Scanner;

public class b186 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cookie, chocolate, cake;
		int cookie10, cake2;

		while (scan.hasNext()) {
			cookie = scan.nextInt();
			chocolate = scan.nextInt();
			cake = scan.nextInt();

			cookie10 = cookie / 10;
			cake2 = cake / 2;

			if (cookie10 > cake2)
				chocolate += cake2;
			else if (cookie10 < cake2)
				chocolate += cookie10;
			else
				chocolate += cookie10;

			System.out.println(String.format("%d 個餅乾，%d 盒巧克力，%d 個蛋糕。", cookie, chocolate, cake));
		}
		scan.close();
	}
}