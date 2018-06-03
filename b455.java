import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class b455 {

	public static void main(String[] args) throws IOException {
		// String path =
		// "C:\\Users\\a0970\\eclipse-workspace\\ZeroJudge\\ShowImage.png";
		// BufferedImage image = ImageIO.read(new FileInputStream(path));

		URL url = new URL("https://zerojudge.tw/ShowImage?id=796");
		HttpURLConnection httpConn = null;
		httpConn = (HttpURLConnection) url.openConnection();
		httpConn.setRequestMethod("GET");

		InputStream in = httpConn.getInputStream();
		// BufferedReader bf = new BufferedReader(new InputStreamReader(in));
		// BufferedInputStream bis = new BufferedInputStream(in);
		try {
			BufferedImage image = ImageIO.read(in);

			int w = image.getWidth();
			int h = image.getHeight();

			int[][] r = new int[w][h];
			int[][] g = new int[w][h];
			int[][] b = new int[w][h];

			for (int i = 0; i < w; ++i) {
				for (int j = 0; j < h; ++j) {
					int color = image.getRGB(i, j);

					int blue = color & 0xff;
					int green = (color & 0xff00) >> 8;
					int red = (color & 0xff0000) >> 16;

					r[i][j] = red;
					g[i][j] = green;
					b[i][j] = blue;
				}
			}

			System.out.println(w + " " + h);
			for (int i = 0; i < w; ++i) {
				for (int j = 0; j < h; ++j) {
					System.out.print(r[j][i] + " " + g[j][i] + " " + b[j][i] + " ");
				}
				System.out.println();				
			}
			in.close();
			httpConn.disconnect();
		} finally {
			if (httpConn != null)
				httpConn.disconnect();
		}
	}
}