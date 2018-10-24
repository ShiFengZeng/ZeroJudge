import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] names = br.readLine().split(" ");
		System.out.println(String.format("%s and %s sitting in the tree", names[0], names[1]));
	}
}
