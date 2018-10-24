import java.math.BigInteger;
import java.util.Scanner;

public class d047 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			BigInteger year = scan.nextBigInteger();
			Boolean isOrdinary = true;

			if (leapYear(year)) {
				isOrdinary = false;
				System.out.println("This is leap year.");
			}
			if (huluculuYear(year)) {
				isOrdinary = false;
				System.out.println("This is huluculu festival year.");
			}
			if (bulukuluYear(year)) {
				isOrdinary = false;
				System.out.println("This is bulukulu festival year.");
			}

			if (isOrdinary) {
				System.out.println("This is an ordinary year.");
			}
			System.out.println();
		}
		scan.close();
	}

	static Boolean leapYear(BigInteger y) {
		BigInteger zero = BigInteger.ZERO;
		if (y.mod(BigInteger.valueOf(4)).compareTo(zero) == 0 && y.mod(BigInteger.valueOf(100)).compareTo(zero) != 0
				|| y.mod(BigInteger.valueOf(400)).compareTo(zero) == 0) {
			return true;
		} else {
			return false;
		}
	}

	static Boolean huluculuYear(BigInteger y) {
		BigInteger zero = BigInteger.ZERO;
		if (y.mod(BigInteger.valueOf(15)).compareTo(zero) == 0) {
			return true;
		} else {
			return false;
		}
	}

	static Boolean bulukuluYear(BigInteger y) {
		BigInteger zero = BigInteger.ZERO;
		if (leapYear(y) && y.mod(BigInteger.valueOf(55)).compareTo(zero) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
