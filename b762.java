import java.util.Scanner;

public class b762 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			ENGLAND england = new ENGLAND();

			for (int i = 0; i < n; ++i) {
				String status = scan.next();

				england.setStatus(status);
				if (status.equals("Get_Kill") || status.equals("Die")) {
					System.out.println(england.getStatus());
				}
			}
			england.printStatus();
		}
	}

}

class ENGLAND {
	private String s;
	private int combo;
	private int killTimes;
	private int assistTimes;
	private int dieTimes;

	public ENGLAND() {
		killTimes = 0;
		assistTimes = 0;
		dieTimes = 0;
	}

	public void setStatus(String str) {
		if (str.equals("Get_Assist")) {
			getAssist();
		} else {
			s = str;
		}
	}

	public String getStatus() {
		switch (s) {
		case "Get_Kill":
			getKill();
			break;
		// case "Get_Assist":
		// getAssist();
		// break;
		case "Die":
			die();
			break;
		}
		return s;
	}

	private String getKill() {
		combo++;
		killTimes++;

		if (combo < 3) {
			s = "You have slain an enemie.";
		} else if (combo == 3) {
			s = "KILLING SPREE!";
		} else if (combo == 4) {
			s = "RAMPAGE~";
		} else if (combo == 5) {
			s = "UNSTOPPABLE!";
		} else if (combo == 6) {
			s = "DOMINATING!";
		} else if (combo == 7) {
			s = "GUALIKE!";
		} else if (combo >= 8) {
			s = "LEGENDARY!";
		}
		return s;
	}

	private void getAssist() {
		assistTimes++;
	}

	private String die() {
		if (combo < 3) {
			s = "You have been slained.";
		} else if (combo >= 3) {
			s = "SHUTDOWN.";
		}
		combo = 0;
		dieTimes++;

		return s;
	}

	public void printStatus() {
		System.out.println(killTimes + "/" + dieTimes + "/" + assistTimes);
	}
}
