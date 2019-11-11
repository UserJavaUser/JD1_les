package by.htp.jd1.les7;

import java.util.Random;

public class Exercise3 {
	public static void exercise3() {
	//3. Дана матрица.
	//Вывести на экран первый и последний столбцы. 
	int[][] arr = new int[3][3];
	fillArray(arr);
	printArray(arr);
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
				if((j == 0) || (j == arr[i].length -1)) {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
	}
}
