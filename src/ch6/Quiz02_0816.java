package ch6;

public class Quiz02_0816 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1, 1, 1 }, 
						{ 1, 1, 0, 1, 0 }, 
						{ 1, 0, 0, 0, 0 }, 
						{ 1, 1, 0, 1, 0 }, 
						{ 1, 1, 1, 1, 1 } 
						};

		int answer = bingoCount(arr);
		System.out.println("answer: " + answer);

	}

	static int bingoCount(int arr[][]) {
		// 각 행의 합과 각 열의 합과 양쪽 대각선의 합이 각각 5라면, 빙고 숫자를 1 추가 한다.
		int cnt = 0;
		int[][] tmp = new int[arr.length + 1][arr[0].length + 1];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				tmp[i][arr[i].length] += arr[i][j]; // 각 행의 합
				tmp[arr.length][i] += arr[j][i]; // 각 열의 합

				if (i == j) // 오른쪽 아래로 향하는 대각선의 합
					tmp[arr.length][arr[i].length] += arr[i][j];

				if (i + j == 4) // 왼쪽 아래로 향하는 대각선의 합
					tmp[0][0] += arr[i][j];

				if (tmp[i][arr[i].length] == 5)
					cnt++;
			}
			if (tmp[arr.length][i] == 5 || tmp[arr.length][arr[i].length] == 5)
				cnt++;
		}
		if (tmp[0][0] == 5)
			cnt++;

		for (int i = 0; i < tmp.length; i++) { // tmp 배열 출력
			for (int j = 0; j < tmp[i].length; j++) {
				System.out.print(tmp[i][j]);
			}
			System.out.println();
		}

		return cnt;
	}

}
