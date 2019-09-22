import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] level = new String[] { "Saber", "Lancer", "Archer", "Rider", "Caster", "Assassin", "Berserker" };
		int[] n = new int[7];

		while ((line = br.readLine()) != null) {
			for (int i = 0; i < line.length(); ++i) {
				char l = line.charAt(i);
				if (Character.isAlphabetic(l)) {
					n[(Character.toLowerCase(l) - 'a') % 7] += 1;
				}
			}
		}

		int max_count = 0;
		for (int i = 0; i < 7; ++i) {
			if (max_count < n[i]) {
				max_count = n[i];
			}
		}

		for (int i = 0; i < 7; ++i) {
			if (n[i] == max_count) {
				System.out.println(level[i]);
				break;
			}
		}
	}
}
