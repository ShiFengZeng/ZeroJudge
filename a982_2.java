import java.util.LinkedList;
import java.util.Scanner;

public class a982_2 {
	public static void main(String[] args) {
		// BFS
		Scanner scan = new Scanner(System.in);
		int nm;

		while (scan.hasNext()) {
			// n和m大小
			nm = scan.nextInt();

			char[][] maze = new char[nm][nm];
			Maze2 m = new Maze2(maze);
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
			
			m.go();
		}
		scan.close();
	}
}

class Maze2 {
	private char[][] maze;
	private static final char ROAD = '.';
	// private static final char WALL = '#';
	private int entranceX, entranceY;
	private int exitX, exitY;
	private static final int[][] d = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

	public boolean[][] visted;

	Maze2(char[][] maze) {
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
	int depth = 0;

	public void go() {
		LinkedList<Position> queue = new LinkedList<>();
		Position entrance = new Position(entranceX, entranceY);
		queue.addLast(entrance);
		visted[entranceX][entranceY] = true;

		boolean isSolved = false;
		while (queue.size() != 0) {
			Position curPos = queue.pop();

			if (curPos.getX() == exitX && curPos.getY() == exitY) {
				findPath(curPos);
				isSolved = true;
				System.out.println(depth);
				break;
			}

			for (int i = 0; i < 4; i++) {
				int newX = curPos.getX() + d[i][0];
				int newY = curPos.getY() + d[i][1];
				if (maze[newX][newY] == ROAD && !visted[newX][newY]) {
					queue.addLast(new Position(newX, newY, curPos));
					visted[newX][newY] = true;
				}
			}

		}
		if (!isSolved) {
			System.out.println("No solution!");
		}
	}

	private void findPath(Position de) {
		// 往回走
		Position cur = de;
		while (cur != null) {
			cur = cur.getPrev();
			depth++;
		}
	}
}

class Position {
	private int x;
	private int y;
	private Position prev;

	Position(int x, int y, Position prev) {
		this.x = x;
		this.y = y;
		this.prev = prev;
	}

	Position(int x, int y) {
		this(x, y, null);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Position getPrev() {
		return prev;
	}
}