import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class c634 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		ArrayList<String> ls = new ArrayList<String>();
		while ((str = br.readLine()) != null) {
			ls.add(str);
		}
		System.out.print(fun(ls));
	}

	public static int getNumber(String str) {
		int result = 0;
		int strLen = str.length();

		for (int i = 0; i < strLen; ++i) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				result = result * 10 + str.charAt(i) - '0';
			}
		}

		return result;
	}

	public static String getT(String str) {
		String result = "";
		int strLen = str.length();

		for (int i = 0; i < strLen; ++i) {
			if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				result += str.charAt(i);
			}
		}

		return result;
	}

	public static int calPrimeFactorsSum(int n) {
		int result = 0;

		for (int i = 2; i <= n; i++) {
			boolean isAdd = false;
			while (n % i == 0) {
				n /= i;
				if (!isAdd)
					result += i;
				isAdd = true;
			}
		}

		return result;
	}

	public static StringBuilder fun(ArrayList<String> arrLs) {
		StringBuilder result = new StringBuilder();
		int size = arrLs.size();
		MyClass[] MyClass = new MyClass[size];
		Compare1 comp1 = new Compare1();
		for (int i = 0; i < size; ++i) {
			String arr = arrLs.get(i);
			int num = getNumber(arr);
			String T = getT(arr);
			int sum = calPrimeFactorsSum(num);
			MyClass[i] = new MyClass(T, arr, sum, num);
		}
		Arrays.sort(MyClass, comp1);
		for (int i = 0; i < size; ++i) {
			result.append(MyClass[i].s + "\n");
		}
		return result;
	}
}

class MyClass {
	public String T;
	public String s;
	public int sum;
	public int N;

	public MyClass(String T, String s, int sum, int N) {
		this.T = T;
		this.s = s;
		this.sum = sum;
		this.N = N;
	}
}

class Compare1 implements Comparator<MyClass> {

	@Override
	public int compare(MyClass a, MyClass b) {
		if (a.sum > b.sum) {
			return -1;
		} else if (a.sum < b.sum) {
			return 1;
		} else {
			if (a.T == b.T) {
				if (a.N > b.N) {
					return -1;
				} else {
					return 1;
				}
			} else {
				return a.T.compareTo(b.T);
			}
		}
	}
}