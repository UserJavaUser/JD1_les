package by.htp.jd1.les7;

import java.util.Random;
import java.util.Scanner;

public class Exercise11 {
	public static void exercise11() {
		//11. Дана матрица размера m x n.
		//Вывести ее элементы в следующем порядке: первая строка справа налево,
		//вторая строка слева направо, третья строка справа налево и так далее. 
		 
		String message = "Введите количество строк матрицы";
		int n = enterValue(message);
		String message1 = "Введите количество столбцов матрицы";
		int m = enterValue(message1);
		int[][] arr = new int[n][m];
		fillArray(arr);
		printArray(arr);
		printReverseArray(arr);
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
	
	private static void printReverseArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for(int j = arr[0].length -1; j >= 0; j--) {
					System.out.print("[" + i + "]" + "[" + j + "] = " + arr[i][j] + "\t");
				}
			}
			else {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print("[" + i + "]" + "[" + j + "] = " + arr[i][j] + "\t");
				}
			}
		System.out.println();
		}
		
	}


}
