package by.htp.jd1.les7;

import java.util.Scanner;

public class Exercise28 {
	public static void exercise28() {
		//28. Задана матрица неотрицательных чисел.
		//Посчитать сумму элементов в каждом столбце.
		//Определить, какой столбец содержит максимальную сумму. 

		String message = "Введите количество строк матрицы (n) ";
		int n = enterValue(message);
		while(n < 0) {
			n = enterValue(message);
		}
		String message1 = "Введите количество столбцов матрицы (m) ";
		int m = enterValue(message1);
		while(m < 0) {
			m = enterValue(message1);
		}
		int[][] arr = new int[n][m];
		fillArray(arr);
		printArray(arr);
		int[] sumArr = new int[arr[0].length];
		sumArr = fillArray2(arr);
		int maxSum = findMax(sumArr);
		System.out.println("Максимальная сумма " + maxSum);
		
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
				while(arr[i][j] < 0) {
					arr[i][j] = enterValue(message2);
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
	
	private static int[] fillArray2(int[][] arr) {
		int[] newArr = new int[arr[0].length];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = sumLine(arr, i);
		}
		return newArr;
	}

	private static int sumLine(int[][] arr, int j) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i][j];
		}	
		return sum;
	}
	
	private static int findMax(int[] sumArr) {
		int max = sumArr[0];
		for(int j = 1; j < sumArr.length; j++) {
			if(sumArr[j] > max) {
				max = sumArr[j];
			}
		}	
		return max;
	}

}
