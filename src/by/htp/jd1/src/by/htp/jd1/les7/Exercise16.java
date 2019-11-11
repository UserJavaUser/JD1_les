package by.htp.jd1.les7;

import java.util.Scanner;

public class Exercise16 {
	public static void exercise16() {
		//16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
		
		String message = "Введите размер матрицы n (четное)";
		int n = enterValue(message);
		boolean even = isEven(n);
		if (even) {
			String[][] arr = new String[n][n];
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
	
	
	private static void fillArray(String[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if (j == i) {
					arr[i][j] = (i + 1) + " * " + (j + 2) ;
				}
				else {
					arr[i][j] = "0";
				}
			}
		}
	}
	
	private static void printArray(String[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
		System.out.println();
		}
	}
	
}
