package by.htp.jd1.les7;

import java.util.Random;
import java.util.Scanner;

public class Exercise32 {
	public static void exercise32() {
		//32. Отсортировать строки матрицы по возрастанию
		//и убыванию значений элементов. 
		String message = "Введите количество строк матрицы (n) ";
		int n = enterValue(message);
		String message1 = "Введите количество столбцов матрицы (m) ";
		int m = enterValue(message1);
		int[][] arr = new int[n][m];
		fillArray(arr);
		printArray(arr);
		int[] arr2 = new int[n * m];
		arr2 = fillArray2(arr);

		System.out.println("Отсортированный по возрастанию");
		arr2 = bubbleSortInc(arr2);
		arr = fillArray3(arr, arr2);
		printArray(arr);
		System.out.println("Отсортированный по убыванию");
		arr2 = bubbleSortDec(arr2);
		arr = fillArray3(arr, arr2);
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
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(20);
			}
		}
		
	}

	private static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static int[] fillArray2(int[][] arr) {
		int[] arr2 = new int[arr.length * arr[0].length];
		int k = 0;
		while(k < arr2.length) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr2[k] = arr[i][j];
					k++;
				}
			}
		}
		return arr2;
	}
	
	private static int[] bubbleSortInc(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j< arr.length; j++)
			if(arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
	
	private static int[] bubbleSortDec(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j< arr.length; j++)
			if(arr[i] < arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
	
	private static int[][] fillArray3(int[][] arr, int[] arr2) {
		for (int k = 0; k < arr2.length; k++) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = arr2[k];
					k++;
				}
			}
		}
		return arr;
	}
}
