import java.util.Scanner;

public class a271 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String str = "";
		int x = 0, y = 0, z = 0, w = 0, n = 0, m = 0;

		while (scan.hasNext()) {
			num = scan.nextInt();

			for (int i = 0; i < num; ++i) {
				x = scan.nextInt();
				y = scan.nextInt();
				z = scan.nextInt();
				w = scan.nextInt();
				n = scan.nextInt();
				m = scan.nextInt();

				scan.nextLine();
				str = scan.nextLine();

				if (str.equals("")) {
					System.out.println(m + "g");
					continue;
				} else {
					String[] s = str.split(" ");
					int poisoningCount = 0;

					for (String temp : s) {
						if (poisoningCount > 0) {
							m -= poisoningCount;
						}
						if (m <= 0) {							
							break;
						}

						switch (temp) {
						case "1":
							m += x;
							break;
						case "2":
							m += y;
							break;
						case "3":
							m -= z;
							break;
						case "4":
							m -= w;
							poisoningCount += n;
							break;
						}
					}

					if (m <= 0) {
						System.out.println("bye~Rabbit");
					} else {
						System.out.println(m + "g");
					}
				}
			}
		}
		scan.close();
	}
}
