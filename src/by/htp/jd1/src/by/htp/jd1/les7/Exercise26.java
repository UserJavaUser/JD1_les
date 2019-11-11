package by.htp.jd1.les7;

import java.util.Scanner;

public class Exercise26 {
	public static void exercise26() {
		//26. С клавиатуры вводится двумерный массив чисел размерностью nxm.
		//Выполнить с массивом следующие действия:
		//а) вычислить сумму отрицательных элементов в каждой строке;
		//б) определить максимальный элемент в каждой строке;
		//в) переставить местами максимальный и минимальный элементы матрицы. 
		String message = "Введите количество строк матрицы (n) ";
		int n = enterValue(message);
		String message1 = "Введите количество столбцов матрицы (m) ";
		int m = enterValue(message1);
		int[][] arr = new int[n][m];
		fillArray(arr);
		printArray(arr);
		int[] negative = new int[n];
		negative = fillArray2(arr, n);
		printArray(negative);
		int[] max = new int[n];
		max = fillArray3(arr, n);
		printArray(max);
		arr = changeArray(arr);
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
	
	private static int[] fillArray2(int[][] arr, int n) {
		int[] negative = new int[n];
		for(int i = 0; i < negative.length; i++) {
			negative[i] = sumNegative(arr, i);
		}
		return negative;
	}
	
	private static int sumNegative(int[][] arr, int i) {
		int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < 0) {
					sum++;
				}
			}
		return sum;
	}
	
	private static void printArray(int[] negative) {
		for(int i = 0; i < negative.length; i++) {
			System.out.println( i + " cтрока - " + negative[i]);
		}
		
	}

	private static int[] fillArray3(int[][] arr, int n) {
		int[] max = new int[n];
		for(int i = 0; i < max.length; i++) {
			max[i] = findMax(arr, i);
		}
		return max;
	}

	private static int findMax(int[][] arr, int i) {
		int max = arr[i][0];
		for(int j = 1; j < arr[i].length; j++) {
			if(arr[i][j] > max) {
				max = arr[i][j];
			}
		}
		return max;
	}

	private static int[][] changeArray(int[][] arr) {
		int maxi = findMaxI(arr);
		int maxj = findMaxJ(arr);
		int mini = findMinI(arr);
		int minj = findMinJ(arr);
		int max = arr[maxi][maxj];
		int min = arr[mini][minj];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				if(i == mini && j == minj) {
					arr[i][j] = max;
				}
				if(i == maxi && j == maxj) {
					arr[i][j] = min;
				}
			}
		}
		return arr;
	}

	private static int findMinI(int[][] arr) {
		int min = arr[0][0];
		int mini = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
					mini = i;
				}
			}
		}
		return mini;
	}
	
	private static int findMinJ(int[][] arr) {
		int min = arr[0][0];
		int minj = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
					minj = j;
				}
			}
		}
		return minj;
	}

	private static int findMaxI(int[][] arr) {
		int max = arr[0][0];
		int maxi = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					maxi = i;
				}
			}
		}
		return maxi;
	}
	
	private static int findMaxJ(int[][] arr) {
		int max = arr[0][0];
		int maxj = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					maxj = j;
				}
			}
		}
		return maxj;
	}

}
