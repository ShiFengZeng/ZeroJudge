import java.util.Scanner;

public class a004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		//��
		while (scanner.hasNext()) {
			int i = scanner.nextInt();
			if (i % 4 == 0) {
				if (i % 100 == 0) {
					if (i % 400 == 0) {
						System.out.println("�|�~");
					} else {
						System.out.println("���~");
					}
				} else {
					System.out.println("�|�~");
				}
			} else {
				System.out.println("���~");
			}			
		}
		scanner.close();
	}
}
