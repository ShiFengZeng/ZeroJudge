import java.util.Scanner;

public class d584 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int adv = scan.nextInt();
			int lv = scan.nextInt();

			MapleStory ms = new MapleStory();
			ms.setOccupationAndLevel(adv, lv);
			System.out.println(ms.getSkillPoint());
		}
	}
}

class MapleStory {
	// 0是初心者、1是劍士、2是法師、3是弓箭手、4是盜賊
	private int adventurers;
	private int skillPoint;
	private int level;

	public MapleStory() {
		adventurers = 0;
		skillPoint = 0;
		level = 0;
	}

	public void setOccupationAndLevel(int adv, int lv) {
		adventurers = adv;
		level = lv;
	}

	public int getSkillPoint() {
		switch (adventurers) {
		case 0:
			Begineer();
			break;
		case 1:
			Warrior();
			break;
		case 2:
			Magician();
			break;
		case 3:
			Bowman();
			break;
		case 4:
			Thief();
			break;
		}

		return skillPoint;
	}

	private int Begineer() {
		skillPoint = 0;
		return skillPoint;
	}

	private int Warrior() {
		if (level >= 10) {
			if (level >= 120) {
				skillPoint += 6;
			} else if (level >= 70) {
				skillPoint += 3;
			} else if (level >= 30) {
				skillPoint += 2;
			} else if (level >= 10) {
				skillPoint++;
			}

			skillPoint += (level - 10) * 3;
		}
		return skillPoint;
	}

	private int Magician() {
		if (level >= 8) {
			if (level >= 120) {
				skillPoint += 6;
			} else if (level >= 70) {
				skillPoint += 3;
			} else if (level >= 30) {
				skillPoint += 2;
			} else if (level >= 8) {
				skillPoint++;
			}
			
			skillPoint += (level - 8) * 3;
		}
		return skillPoint;
	}

	private int Bowman() {
		return Warrior();
	}

	private int Thief() {
		return Warrior();
	}
}
