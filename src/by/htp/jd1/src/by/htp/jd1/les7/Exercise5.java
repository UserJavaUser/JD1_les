package by.htp.jd1.les7;

import java.util.Random;

public class Exercise5 {
	public static void exercise5() {
		//5. Дана матрица.
		//Вывести на экран все четные строки, то есть с четными номерами. 
		int[][] arr = new int[6][6];
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
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if((i % 2 == 0)) {
					System.out.print("[" + i + "]" + "[" + j + "] = " + arr[i][j] + "\t");
				}
				
			}
			System.out.println();
		}
		
	}
}
