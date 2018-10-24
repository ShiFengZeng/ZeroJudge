import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c116 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			String[] inputStr = line.split(" ");
			double x1 = Double.valueOf(inputStr[0]);
			double y1 = Double.valueOf(inputStr[1]);
			double x2 = Double.valueOf(inputStr[2]);
			double y2 = Double.valueOf(inputStr[3]);
			double x3 = Double.valueOf(inputStr[4]);
			double y3 = Double.valueOf(inputStr[5]);

			C116Point p1 = new C116Point(x1, y1);
			C116Point p2 = new C116Point(x2, y2);
			C116Point p3 = new C116Point(x3, y3);

			double a = distance(p1, p2);
			double b = distance(p1, p3);
			double c = distance(p2, p3);

			double s = (a + b + c) / 2; // 海龍公式
			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // 海龍公式 面積
			double r = a * b * c / (4 * area); // 外接圓半徑 r=a*b*c/(4*area)
			double PI = 3.141592653589793;
			
			System.out.println(String.format("%.2f", 2 * PI * r));
		}
	}

	static double distance(C116Point p1, C116Point p2) {
		double _x = p1.x - p2.x;
		double _y = p1.y - p2.y;
		return Math.sqrt(_x * _x + _y * _y);
	}
}

class C116Point {
	double x;
	double y;

	public C116Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
