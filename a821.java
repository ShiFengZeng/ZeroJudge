import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class a821 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NR = br.readLine().split(" ");
		int N = Integer.valueOf(NR[0]);
		int R = Integer.valueOf(NR[1]);
		HashMap<String, Integer> team_win = new HashMap<>();
		HashMap<String, Integer> team_lose = new HashMap<>();

		String line;
		while ((line = br.readLine()) != null) {
			String[] lineSp = line.split(" ");
			String win = lineSp[0];
			String lose = lineSp[1];

			if (team_win.containsKey(win)) {
				team_win.put(win, team_win.get(win) + 1);
			} else {
				team_win.put(win, 1);
			}

			if (team_lose.containsKey(lose)) {
				team_lose.put(lose, team_lose.get(lose) + 1);
			} else {
				team_lose.put(lose, 1);
			}
		}

		int win_max = 0;
		win_max = Collections.max(team_win.values());

		ArrayList<String> win_eq = new ArrayList<>();

		for (Entry<String, Integer> v : team_win.entrySet()) {
			if (v.getValue() == win_max) {
				win_eq.add(v.getKey());
			}
		}

		int min = 999;
		int lose_min = 999;
		boolean isSol = false;
		if (win_eq.size() == 1) {
			System.out.println(win_eq.get(0));
		} else {
			for (String w : win_eq) {
				if (!team_lose.containsKey(w)) {
					System.out.println(w);
					isSol = true;
					break;
				} else {
					lose_min = team_lose.get(w);
					min = Math.min(min, lose_min);
				}
			}

			if (!isSol)
				for (String w : win_eq)
					if (team_lose.get(w) == min)
						System.out.println(w);
		}
	}
}
