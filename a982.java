import java.util.Scanner;

public class a982 {
	public static void main(String[] args) {
		//DFS 逾時 
		Scanner scan = new Scanner(System.in);
		int nm;

		while (scan.hasNext()) {
			// n和m大小
			nm = scan.nextInt();

			char[][] maze = new char[nm][nm];
			Maze m = new Maze(maze);
			m.visted = new boolean[nm][nm];

			for (int i = 0; i < nm; ++i) {
				// 一行一行讀取
				String line = scan.next();
				for (int j = 0; j < nm; ++j) {
					// 每個array給予賦值
					maze[i][j] = line.charAt(j);
					m.visted[i][j] = false;
				}
			}

			System.out.println(m.go(m.getEntranceX(), m.getEntranceY(), 1) == Integer.MAX_VALUE ? "No solution!"
					: m.go(m.getEntranceX(), m.getEntranceY(), 1));
		}
		scan.close();
	}
}

class Maze {
	private char[][] maze;
	private static final char ROAD = '.';
	// private static final char WALL = '#';
	private int entranceX, entranceY;
	private int exitX, exitY;
	private static final int[][] d = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

	public boolean[][] visted;

	Maze(char[][] maze) {
		this.maze = maze;
		entranceX = 1;
		entranceY = 1;
		exitX = maze.length - 2;
		exitY = maze.length - 2;
	}

	public int getEntranceX() {
		return entranceX;
	}

	public int getEntranceY() {
		return entranceY;
	}

	// public int getExitX() {
	// return exitX;
	// }
	//
	// public int getExitY() {
	// return exitY;
	// }
	int depth = Integer.MAX_VALUE;

	public int go(int x, int y, int depth) {
		visted[x][y] = true;

		if (x == exitX && y == exitY) {
			if (this.depth > depth) {
				this.depth = depth;
			}
		}

		for (int i = 0; i < 4; i++) {
			int newX = x + d[i][0];
			int newY = y + d[i][1];
			if (maze[newX][newY] == ROAD && !visted[newX][newY]) {
				go(newX, newY, depth + 1);
				visted[newX][newY] = false;
			}
		}
		return this.depth;
	}

}