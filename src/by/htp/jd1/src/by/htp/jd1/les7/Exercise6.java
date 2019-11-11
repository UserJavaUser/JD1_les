package by.htp.jd1.les7;

import java.util.Random;

public class Exercise6 {
	public static void exercise6() {
		//6. Дана матрица. Вывести на экран все нечетные столбцы,
		//у которых первый элемент больше последнего. 
		int[][] arr = new int[6][6];
		fillArray(arr);
		printArray(arr);
		int k = countLines(arr);
		int[] arr2 = new int[k];
		arr2 = findLines(arr, arr2); 
		System.out.println("Нечетные столбцы, где первый элемент больше");
		printArray2(arr2, arr);
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
	
	private static int countLines(int[][] arr) {
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			if ((i % 2 != 0)) {
				int first = arr[i][0];
				int second = arr[i][arr[0].length - 1];
					if (first > second){
						k++;
					}
				}
		}	
		return k;
	}
	
	private static int[] findLines(int[][] arr, int[] arr2) {
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			if ((i % 2 != 0)) {
				int first = arr[i][0];
				int second = arr[i][arr[0].length - 1];
				if (first > second){
					arr2[k] = i;
					k++;
				}
			}
		}
		return arr2;
	}
	
	private static void printArray2(int[] arr2, int[][] arr) {
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[arr2[i]][j] + "\t");
			}
		System.out.println();
		}
	}
	
}
