import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class c168 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		int needPenNum;
		int[] pen1 = new int[2];
		int[] pen2 = new int[2];
		int[] pen3 = new int[2];
		int price1;
		int price2;
		int price3;
		while ((line = br.readLine()) != null) {
			needPenNum = Integer.valueOf(line);
			String[] temp1 = br.readLine().split(" ");
			String[] temp2 = br.readLine().split(" ");
			String[] temp3 = br.readLine().split(" ");

			pen1 = Arrays.stream(temp1).mapToInt(Integer::parseInt).toArray();
			pen2 = Arrays.stream(temp2).mapToInt(Integer::parseInt).toArray();
			pen3 = Arrays.stream(temp3).mapToInt(Integer::parseInt).toArray();

			// 0 數量 1價錢
			price1 = (needPenNum % pen1[0] == 0 ? needPenNum / pen1[0] : needPenNum / pen1[0] + 1) * pen1[1];
			price2 = (needPenNum % pen2[0] == 0 ? needPenNum / pen2[0] : needPenNum / pen2[0] + 1) * pen2[1];
			price3 = (needPenNum % pen3[0] == 0 ? needPenNum / pen3[0] : needPenNum / pen3[0] + 1) * pen3[1];

			System.out.println(Math.min(price1, Math.min(price2, price3)));
		}		
	}

}