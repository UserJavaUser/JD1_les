package by.htp.jd1.les7;

import java.util.Scanner;

public class Exercise20 {
	public static void exercise20() {
		//20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное) 
		//100...001
		//110...011
		//111...111
		//.........
		//110...011
		//100...001
		
		String message = "Введите размер матрицы n (четное)";
		int n = enterValue(message);
		boolean even = isEven(n);
		if (even) {
			int[][] arr = new int[n][n];
			fillArray(arr);
			printArray(arr);
		}
		else {
			
		}
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

	private static boolean isEven(int n) {
		boolean even = false;
		if (n % 2 != 0) {
			return even;
		}
		else {
			even = true;
		}
		return even;
	}
	
	
	private static void fillArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if (i == arr.length / 2) {
					arr[i][j] = 1;
				}
				else if((j <= i) && (i < arr.length / 2)){
					arr[i][j] = 1;
				}
				else if((j >= arr[i].length - i - 1) && (i < arr.length / 2)){
					arr[i][j] = 1;
				}
				else if((j <= arr[i].length - i - 1) && (i >= arr.length / 2)){
					arr[i][j] = 1;
				}
				else if((j >= i) && (i >= arr.length / 2)){
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = 0;
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
	
}
