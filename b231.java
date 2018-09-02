import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class b231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while ((line = br.readLine()) != null) {
			int T = Integer.valueOf(line);
			Book[] book = new Book[T];
			for (int i = 0; i < T; ++i) {
				String[] temp = br.readLine().split(" ");
				book[i] = new Book(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]));
			}
			CompareBook cb = new CompareBook();
			Arrays.sort(book, cb);

			int thisBookPrintTime = 0;
			int thisBookFinishTime = 0;
			int totalTime = 0;

			for (int i = 0; i < T; ++i) {
				thisBookPrintTime += book[i].printTime;
				thisBookFinishTime = (thisBookPrintTime + book[i].bindTime);
				totalTime = Math.max(totalTime, thisBookFinishTime);
			}

			System.out.println(totalTime);
		}		
	}

}

class Book {
	int printTime;
	int bindTime;

	public Book(int p, int b) {
		this.printTime = p;
		this.bindTime = b;
	}
}

class CompareBook implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		if (b1.bindTime < b2.bindTime) {
			return 1;
		} else {
			return -1;
		}
	}
}