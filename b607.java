//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class b607 {
//
//	public static void main(String[] args) {
//
//		List<Integer> primeList = new ArrayList<>();
//		primeList.add(2);
//		primeList.add(3);
//		primeList.add(5);
//		primeList.add(7);
//		for (int i = 11; i <= 10000; i += 2) {
//			boolean isPrime = true;
//			for (int j = 2; j <= Math.sqrt(i); ++j) {
//				if (i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if (isPrime) {
//				primeList.add(i);
//			}
//		}
//
//		Scanner scan = new Scanner(System.in);
//		int n;
//
//		while (scan.hasNext()) {
//			n = scan.nextInt();
//			int max = 0, min = Integer.MAX_VALUE;
//
//			for (int i = 0; i < primeList.size(); ++i) {
//				boolean isPrime = true;
//				int prime2 = n - primeList.get(i);
//
//				for (int j = 0; j < primeList.size(); ++j) {
//					if (prime2 % primeList.get(j) == 0 && prime2 != primeList.get(j)) {
//						isPrime = false;
//						break;
//					}
//				}
//
//				if (isPrime && prime2 > 1) {
//					if (primeList.get(i) <= prime2) {
//						max = primeList.get(i);
//						min = prime2;
//					}
//
//				}
//			}
//			if (max != 0) {
//				System.out.println(String.format("%d %d %d", 2, max, min));
//			} else {
//				System.out.println(String.format("%d %d", 1, n));
//			}
//		}
//		scan.close();
//	}
//}