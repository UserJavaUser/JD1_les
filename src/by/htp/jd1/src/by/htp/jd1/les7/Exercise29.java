package by.htp.jd1.les7;

import java.util.Scanner;

public class Exercise29 {
	public static void exercise29() {
		//29. Найти положительные элементы главной диагонали квадратной матрицы. 
		String message = "Введите размер матрицы (n) ";
		int n = enterValue(message);
		while(n < 0) {
			n = enterValue(message);
		}
		int[][] arr = new int[n][n];
		fillArray(arr);
		printArray(arr);
		int[] diagonal = new int[arr[0].length];
		diagonal = fillArray2(arr);
		printPositive(diagonal);
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
		String message2 = "Введите элемент массива";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = enterValue(message2);
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
	
	private static int[] fillArray2(int[][] arr) {
		int[] diagonal = new int[arr[0].length];
		for(int i = 0; i < diagonal.length; i++) {
			diagonal[i] = arr[i][i];
		}
		return diagonal;
	}
	
	private static void printPositive(int[] diagonal) {
		for(int i = 0; i < diagonal.length; i++) {
			if(diagonal[i] > 0) {
				System.out.println(diagonal[i]);
			}
		}
	}

}
