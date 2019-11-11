package by.htp.jd1.les7;

import java.util.Random;

public class Exercise2 {
	public static void exercise2() {
	//2. Создать и вывести на экран матрицу 2 x 3,
	//заполненную случайными числами из [0, 9]. 
	int[][] arr = new int[2][3];
	fillArray(arr);
	printArray(arr);
	}

	private static void fillArray(int[][] arr) {
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
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
}
