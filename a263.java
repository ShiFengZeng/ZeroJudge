import java.util.Scanner;

public class a263 {

	private static final int[] leapYearEachMonthDays = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] normalYearEachMonthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int year1 = 0, year2 = 0;
			int month1 = 0, month2 = 0;
			int day1 = 0, day2 = 0;
			int monthForDays = 0;

			year1 = scan.nextInt();
			month1 = scan.nextInt();
			day1 = scan.nextInt();
			year2 = scan.nextInt();
			month2 = scan.nextInt();
			day2 = scan.nextInt();

			if (year1 < year2) {
				int ytemp = year1;
				year1 = year2;
				year2 = ytemp;
				int mtemp = month1;
				month1 = month2;
				month2 = mtemp;
				int dtemp = day1;
				day1 = day2;
				day2 = dtemp;
			}

			if (year1 > year2) {

				if (isLeapYear(year2)) {
					for (int j = month2; j <= 12; ++j) {
						monthForDays += leapYearEachMonthDays[j];
					}
				} else {
					for (int j = month2; j <= 12; ++j) {
						monthForDays += normalYearEachMonthDays[j];
					}
				}
				monthForDays -= day2;

				for (int i = year1 - 1; i > year2; --i) {
					if (isLeapYear(i))
						monthForDays += 366;
					else
						monthForDays += 365;
				}

				if (isLeapYear(year1)) {
					for (int i = 1; i < month1; ++i) {
						monthForDays += leapYearEachMonthDays[i];
					}
				} else {
					for (int i = 1; i < month1; ++i) {
						monthForDays += normalYearEachMonthDays[i];
					}
				}
				monthForDays += day1;
				System.out.println(monthForDays);
			} else if (year1 == year2) {
				if (isLeapYear(year1)) {
					if (month1 > month2) {
						for (int i = month2; i < month1; ++i) {
							monthForDays += leapYearEachMonthDays[i];
						}
						monthForDays -= day2;
						monthForDays += day1;
					} else if (month1 < month2) {
						for (int i = month1; i < month2; ++i) {
							monthForDays += leapYearEachMonthDays[i];
						}
						monthForDays -= day1;
						monthForDays += day2;
					} else {
						monthForDays = Math.abs(day2 - day1);
					}
				}else {
					if (month1 > month2) {
						for (int i = month2; i < month1; ++i) {
							monthForDays += normalYearEachMonthDays[i];
						}
						monthForDays -= day2;
						monthForDays += day1;
					} else if (month1 < month2) {
						for (int i = month1; i < month2; ++i) {
							monthForDays += normalYearEachMonthDays[i];
						}
						monthForDays -= day1;
						monthForDays += day2;
					} else {
						monthForDays = Math.abs(day2 - day1);
					}
				}
				System.out.println(monthForDays);
			}

		}
		scan.close();
	}

	public static boolean isLeapYear(int i) {
		if (i % 4 == 0) {
			if (i % 100 == 0) {
				if (i % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
