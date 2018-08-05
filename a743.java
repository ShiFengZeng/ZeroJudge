import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class a743 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		Map<String, Integer> map = new TreeMap<String, Integer>();
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);

			for (int i = 0; i < n; ++i) {
				String in = br.readLine();
				String[] ins = in.split("[ ]+");
				String country = ins[0];

				if (!map.containsKey(country)) {
					map.put(country, 1);
				} else {
					map.put(country, map.get(country) + 1);
				}
			}
			
			for(String each:map.keySet())  
	        {  
	            System.out.println(each+" "+map.get(each));  
	              
	        } 
//			map.forEach((key, value) -> System.out.println(key + " " + value));
		}
	}
}