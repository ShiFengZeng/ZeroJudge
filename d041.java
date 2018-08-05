import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class d041 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nString;
		while ((nString = br.readLine()) != null) {
			int n = Integer.valueOf(nString);
			try {
				for (int i = 0; i < n; ++i) {
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					String date1 = br.readLine();
					LocalDate localDate1 = LocalDate.parse(date1, dtf);
					String date2 = br.readLine();
					LocalDate localDate2 = LocalDate.parse(date2, dtf);

					Period period = Period.between(localDate2, localDate1);
					int year = period.getYears();
					int month = period.getMonths();
					int day = period.getDays();
					System.out.println(day);
					if (month < 0) {
						System.out.println(String.format("Case #%d: Invalid birth date", i + 1));
					} else if (year > 130) {
						System.out.println(String.format("Case #%d: Check birth date", i + 1));
					} else {
						System.out.println(String.format("Case #%d: %d", i + 1, year));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
