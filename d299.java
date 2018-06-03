import java.util.Scanner;

public class d299 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int F, O, R, T, Y, E, N, S, I, X;

		N = 0;
		E = 5;
		O = 9;
		I = 1;

		for (F = 1; F < 10; ++F) {
			if (F == E || F == O || F == I) {
				continue;
			}
			for (S = 2; S < 10; ++S) {
				if (S == E || S == O || S == I || S == F) {
					continue;
				}

				else if (S == F + 1) {
					for (R = 1; R < 10; ++R) {
						if (R == E || R == O || R == I || R == S || R == F) {
							continue;
						}

						else
							for (T = 1; T < 10; ++T) {
								if (T == E || T == O || T == I || T == S || T == F || T == R) {
									continue;
								}

								else
									for (X = 1; X < 10; ++X) {
										if (X == E || X == O || X == I || X == S || X == F || X == R || X == T) {
											continue;
										}

										if ((R + T + T + 1) / 10 == 2) {
											if (X == (R + T + T + 1) % 10)
												for (Y = 1; Y < 10; ++Y) {
													if (Y == E || Y == O || Y == I || Y == S || Y == F || Y == R
															|| Y == T || Y == X)
														continue;
													System.out.println(
															String.format("%d%d%d%d%d + %d%d%d + %d%d%d = %d%d%d%d%d",
																	F, O, R, T, Y, T, E, N, T, E, N, S, I, X, T, Y));

												}

										}

									}
							}
					}
				}
			}
		}
		scan.close();
	}
}