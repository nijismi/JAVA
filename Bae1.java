package 토끼잡기;

import java.util.Scanner;
import java.io.FileInputStream;

class Bae1 {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("C:/Users/input4.txt"));
		Scanner sc = new Scanner(System.in);

		int T;
		int N1;
		int N2;

		N1 = sc.nextInt();
		N2 = sc.nextInt();
		int[][] map = new int[N1 + 1][N2 + 1]; 

		for (int i = 1; i <= N1; i++) {
			for (int j = 1; j <= N2; j++) {
				map[i][j] = sc.nextInt();
			}
		} // System.out.println(map[2][2]); //이중배열입력확인

		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int sum = 0;
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			for (int a = x1; a <= x2; a++) {
				for (int b = y1; b <= y2; b++) {
					sum += map[a][b];
				}
			}
			System.out.println(sum);
		}
	}
}
