package by.htp.jd1.les7;

import java.util.Random;

public class Exercise8 {
	public static void exercise8() {
		//8. Дан двухмерный массив n×m элементов.
		//Определить, сколько раз встречается число 7 среди элементов массива. 
		 
		int[][] arr = new int[5][5];
		fillArray(arr);
		int count = countArray(arr);
		printArray(arr);
		System.out.println("Число 7 встречается " + count + " раз(a)");
	}

	private static void fillArray(int[][] arr) {
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(20) - 10;
			}
		}
	}
	
	private static int countArray(int[][] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 7) {
					count++;
				}
			}
		}
		return count;
	}
	
	private static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + i + "]" + "[" + j + "] = " + arr[i][j] + "\t");
			}
		System.out.println();
		}
	}
}
