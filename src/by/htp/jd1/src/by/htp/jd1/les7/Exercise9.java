package by.htp.jd1.les7;

import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
	public static void exercise9() {
		//9. Дана квадратная матрица.
		//Вывести на экран элементы, стоящие на диагонали. 
		String message = "Введите размер матрицы";
		int n = enterValue(message);
		 
		int[][] arr = new int[n][n];
		fillArray(arr);
		printArray(arr);
		printDiagonal(arr);
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
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(20) - 10;
			}
		}
	}
	

	
	private static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + i + "]" + "[" + j + "] = " + arr[i][j] + "\t");
			}
		System.out.println();
		}
	}
	
	private static void printDiagonal(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				if (j == i) {
					System.out.println("[" + i + "]" + "[" + j + "]" + arr[i][j] + "\t");
				}
			}
		}
		
	}
}
