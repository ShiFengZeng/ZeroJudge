import java.util.Scanner;

public class d155 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String �K���� = scan.next();
			String �F�� = scan.next();

			int �K����Win = 0;
			int �F��Win = 0;

			switch (�K����) {
			case "Scissors":
				if (�F��.equals("Stone")) {
					System.out.println("�F�����");
					�F��Win++;
				} else {
					System.out.println("�����");
					�K����Win++;
				}
				break;
			case "Stone":
				if (�F��.equals("Paper")) {
					System.out.println("�F�����");
					�F��Win++;
				} else {
					System.out.println("�����");
					�K����Win++;
				}
				break;
			case "Paper":
				if (�F��.equals("Scissors")) {
					System.out.println("�F�����");
					�F��Win++;
				} else {
					System.out.println("�����");
					�K����Win++;
				}
			}

			if (�K����.equals("Game")) {
				if (�F��Win > �K����Win) {
					System.out.println("�d�G���w���_���o��");
				} else {
					System.out.println("�ä����ܸ�");
				}
				break;
			}
		}
	}
}
