import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b142 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			// 姓名 期末平均成績 班級評議成績 是否是學生幹部 是否是西部省份學生 發表論文數
			String[] students = new String[n];

			int maxScholarship = 0;
			int totalScholarship = 0;
			String getTheMostScholarshipStudent = "";
			for (int i = 0; i < n; ++i) {
				students[i] = br.readLine();
				String[] studentInfo = students[i].split(" ");
				String name = studentInfo[0];
				int avgScore = Integer.valueOf(studentInfo[1]);
				int classScore = Integer.valueOf(studentInfo[2]);
				String cadre = studentInfo[3];
				String westStudent = studentInfo[4];
				int papers = Integer.valueOf(studentInfo[5]);
				int scholarship = 0;

				if (avgScore > 80 && papers >= 1) {
					scholarship += 8000;
				}
				if (avgScore > 85 && classScore > 80) {
					scholarship += 4000;
				}
				if (avgScore > 90) {
					scholarship += 2000;
				}
				if (avgScore > 85 && westStudent.equals("Y")) {
					scholarship += 1000;
				}
				if (classScore > 80 && cadre.equals("Y")) {
					scholarship += 850;
				}

				if (scholarship > maxScholarship) {
					getTheMostScholarshipStudent = name;
					maxScholarship = scholarship;
				}
				totalScholarship += scholarship;
			}
			pw.println(getTheMostScholarshipStudent + "\n" + maxScholarship + "\n" + totalScholarship);
		}
		pw.close();
	}
}