import java.util.Scanner;

public class d155 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String ¤K¶³µµ = scan.next();
			String ÆF¹Ú = scan.next();

			int ¤K¶³µµWin = 0;
			int ÆF¹ÚWin = 0;

			switch (¤K¶³µµ) {
			case "Scissors":
				if (ÆF¹Ú.equals("Stone")) {
					System.out.println("ÆF¹ÚÀò³Ó");
					ÆF¹ÚWin++;
				} else {
					System.out.println("µµÀò³Ó");
					¤K¶³µµWin++;
				}
				break;
			case "Stone":
				if (ÆF¹Ú.equals("Paper")) {
					System.out.println("ÆF¹ÚÀò³Ó");
					ÆF¹ÚWin++;
				} else {
					System.out.println("µµÀò³Ó");
					¤K¶³µµWin++;
				}
				break;
			case "Paper":
				if (ÆF¹Ú.equals("Scissors")) {
					System.out.println("ÆF¹ÚÀò³Ó");
					ÆF¹ÚWin++;
				} else {
					System.out.println("µµÀò³Ó");
					¤K¶³µµWin++;
				}
			}

			if (¤K¶³µµ.equals("Game")) {
				if (ÆF¹ÚWin > ¤K¶³µµWin) {
					System.out.println("´dºGªºÄw±¹°_­»ªo¿ú");
				} else {
					System.out.println("¿Ã¤õªºÂÜ¸ñ");
				}
				break;
			}
		}
	}
}
