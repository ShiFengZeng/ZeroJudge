import java.util.Scanner;

public class b898 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str1 = "", str2 = "", str3 = "";
		int n = 0;
		while (scan.hasNext()) {
			n = scan.nextInt();
			
			for (int i = 0; i < n; ++i) {
				str1 = scan.next();
				str2 = scan.next();
				str3 = scan.next();
				if (str1.length() == str2.length() && str2.length() == str3.length()) {
					if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0)
						System.out.println(str1);
					else if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0)
						System.out.println(str2);
					else
						System.out.println(str3);
				} else if (str1.length() > str2.length() && str1.length() > str3.length()) {
					System.out.println(str1);
				} else if (str2.length() > str3.length() && str2.length() > str1.length()) {
					System.out.println(str2);
				} else if (str3.length() > str1.length() && str3.length() > str2.length()) {
					System.out.println(str3);
				} else {
					if (str1.length() == str2.length()) {
						if (str1.compareTo(str2) > 0)
							System.out.println(str1);
						else
							System.out.println(str2);
					} else if (str2.length() == str3.length()) {
						if (str2.compareTo(str3) > 0)
							System.out.println(str2);
						else
							System.out.println(str3);
					} else {
						if (str3.compareTo(str1) > 0)
							System.out.println(str3);
						else
							System.out.println(str1);
					}
				}
			}
		}
		scan.close();
	}
}
