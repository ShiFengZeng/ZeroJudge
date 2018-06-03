import java.util.Scanner;

public class d710 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();

			ParkingLot p = new ParkingLot(n, scanner);

			p.query(m, scanner);
		}

	}
}

class Car {
	private String brand;
	private String color;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class ParkingLot {
	private Car[] car;
	private int num;

	public ParkingLot(int n, Scanner scanner) {
		num = n;
		car = new Car[n];
		for (int i = 0; i < n; ++i) {
			car[i] = new Car();
			car[i].setBrand(scanner.next());
			car[i].setColor(scanner.next());
		}
	}

	public void query(int m, Scanner scanner) {
		for (int i = 0; i < m; ++i) {
			String brandOrColor = scanner.next();
			String brandOrColorResult = scanner.next();
			for (int j = 0; j < num; ++j) {
				if (brandOrColor.equals("brand")) {
					if (car[j].getBrand().equals(brandOrColorResult)) {
						System.out.println(car[j].getBrand() + " " + car[j].getColor());
					}
				} else {
					if (car[j].getColor().equals(brandOrColorResult)) {
						System.out.println(car[j].getBrand() + " " + car[j].getColor());
					}
				}
			}
		}
	}
}