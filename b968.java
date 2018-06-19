import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b968 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String girlName;
		StringBuilder sb=new StringBuilder();
		while ((girlName = br.readLine()) != null) {
			String boyName = br.readLine();
			
			sb.append(girlName+" and "+boyName+" sitting in the tree\n");
		}
		System.out.print(sb);
	}
}