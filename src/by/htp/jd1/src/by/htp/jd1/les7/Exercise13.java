package by.htp.jd1.les7;

import java.util.Scanner;

public class Exercise13 {
	public static void exercise13() {
		//13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
		String message = "Введите размер матрицы n(четное)";
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
				if(i % 2 == 0) {
					arr[i][j] = j + 1;
				}
				else {
					arr[i][j] = arr[i].length - j;
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
