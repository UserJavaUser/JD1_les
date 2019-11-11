package by.htp.jd1.les7;

import java.util.Random;

public class Exercise30 {
	public static void exercise30() {
		//30. Матрицу 10x20 заполнить случайными числами от 0 до 15.
		//Вывести на экран саму матрицу и номера строк, в которых число 5
		//встречается три и более раз.  
		int[][] arr = new int[10][20];
		fillArray(arr);
		printArray(arr);
		int[] lineWith5 = new int[arr.length];
		lineWith5 = fillArray2(arr);
		printNumbers(lineWith5);
	}

	private static void fillArray(int[][] arr) {
	Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(15);
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
		int[] line = new int[arr.length];
		for(int i = 0; i < line.length; i++) {
			line[i] = findFive(arr, i);
		}
		return line;
	}
	
	private static int findFive(int[][] arr, int i) {
		int count = 0;
		for(int j = 0; j < arr[i].length; j++) {
			if(arr[i][j] == 5) {
					count++;
			}
		}
		return count;
	}

	private static void printNumbers(int[] arr) {
		System.out.println("Число 5 встречается 3 и более раз в строках: ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 3) {
				System.out.println(i);
			}
		}
	}

}
