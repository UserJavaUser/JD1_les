package by.htp.jd1.les7;

import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
	public static void exercise10() {
		//10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.  
		String message = "Введите размер матрицы";
		int n = enterValue(message);
		int[][] arr = new int[n][n];
		fillArray(arr);
		printArray(arr);
		String messageK = "Введите строку матрицы";
		int k = enterValue(messageK);
		printRow(arr, k);
		String messageP = "Введите столбец матрицы";
		int p = enterValue(messageP);
		printColumn(arr, p);
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
	
	private static void printRow(int[][] arr, int k) {
		for(int j = 0; j < arr[k].length; j++) {
			System.out.print("[" + k + "]" + "[" + j + "] = " + arr[k][j] + "\t");	
		}
		System.out.println();
	}
	
	private static void printColumn(int[][] arr, int p) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + i + "]" + "[" + p + "] = " + arr[i][p] + "\t");
		}
	}

}
