import java.util.Arrays;
import java.util.Scanner;

public class d323 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; ++i) {
				a[i] = scan.nextInt();
			}
			 Arrays.sort(a);
//			QuickSort(a, 0, n - 1);
			for (int i = 0; i < n; ++i) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

//	public static int[] QuickSort(int A[], int left, int right) {
//		int i, j, s, Temp;
//		if (left < right) {
//			s = A[(left + right) / 2];
//			i = left - 1;
//			j = right + 1;
//			while (true) {
//				while (A[++i] < s)
//					; // �V�k��
//
//				while (A[--j] > s)
//					; // �V����
//
//				if (i >= j)
//					break;
//
//				Temp = A[i];
//				A[i] = A[j];
//				A[j] = Temp;
//			}
//			QuickSort(A, left, i - 1); // �索��i�滼�j
//			QuickSort(A, j + 1, right); // ��k��i�滼�j
//		}
//		return A;
//	}
}