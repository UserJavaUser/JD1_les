package by.htp.jd1.les7;

import java.util.Random;

public class Exercise7 {
	public static void exercise7() {
		//7. Дан двухмерный массив 5×5.
		//Найти сумму модулей отрицательных нечетных элементов. 
		 
		int[][] arr = new int[5][5];
		fillArray(arr);
		int sum = sumArray(arr);
		printArray(arr);
		System.out.println("sum = " + sum);
	}

	private static void fillArray(int[][] arr) {
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(20) - 10;
			}
		}
	}
	
	private static int sumArray(int[][] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++) {
				if ((j % 2 != 0) && (i % 2 != 0) && (arr[i][j] < 0)) {
					sum = sum + (int)Math.abs(arr[i][j]);
				}
			}
		return sum;
	}
	
	private static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + i + "]" + "[" + j + "] = " + arr[i][j] + "\t");
			}
		System.out.println();
		}
	}
}
