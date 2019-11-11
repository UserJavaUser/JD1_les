package by.htp.jd1.les7;

import java.util.Scanner;

public class Exercise12 {
	public static void exercise12() {
		//12. Получить квадратную матрицу порядка n
		 
		String message = "Введите размер матрицы";
		int n = enterValue(message);
		int[][] arr = new int[n][n];
		fillArray(arr);
		printArray(arr);
	}

	private static int enterValue(String message) {
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;
	}

	private static void fillArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = i;
				}
				else {
					arr[i][j] = 0;
				}
			}
		}
	}
	
	private static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
		System.out.println();
		}
	}
	
}
