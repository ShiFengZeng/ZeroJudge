import java.util.Scanner;

public class a528 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			String[] str = new String[n];

			for (int i = 0; i < n; ++i) {
				str[i] = scan.next();
			}

			for (int i = 0; i < n; ++i) {
				for (int j = i; j < n; ++j) {

					if (str[i].indexOf("-") == -1 && str[j].indexOf("-") == 0) {
						String temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}

					if (str[i].length() > str[j].length() && str[i].indexOf("-") == -1 && str[j].indexOf("-") == -1) {
						String temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					} else if (str[i].length() == str[j].length()) {
						if (str[i].compareTo(str[j]) > 0) {
							String temp = str[i];
							str[i] = str[j];
							str[j] = temp;
						}
					}

					if (str[i].indexOf("-") == 0 && str[j].indexOf("-") == 0) {

						if (str[i].length() < str[j].length()) {
							String temp = str[i];
							str[i] = str[j];
							str[j] = temp;
						} else if (str[i].length() == str[j].length()) {
							if (str[i].compareTo(str[j]) < 0) {
								String temp = str[i];
								str[i] = str[j];
								str[j] = temp;
							}
						}
					}
				}
			}

			for (int i = 0; i < n; ++i) {
				System.out.println(str[i]);
			}
		}
		scan.close();
	}
}
