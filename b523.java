import java.util.HashSet;
import java.util.Scanner;

public class b523 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		HashSet<String> word = new HashSet<String>();
		
		while (scan.hasNext()) {			
			str = scan.nextLine();
			if (!word.contains(str)) {
				System.out.println("NO");
				word.add(str);
			} else if(word.contains(str)){
				System.out.println("YES");
			}
		}
		scan.close();
	}
}