package by.htp.jd1.les7;

import java.util.Random;

public class Exercise4 {
	public static void exercise4() {
	//4. Дана матрица.
	//Вывести на экран первую и последнюю строки. 
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
				if((i == 0) || (i == arr[i].length -1)) {
					System.out.print("[" + i + "]" + "[" + j + "] = " + arr[i][j] + "\t");
				}
				
			}
			System.out.println();
		}
		
	}
}
