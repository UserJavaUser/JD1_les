package by.htp.jd1.les7;

import java.util.Random;
import java.util.Scanner;

public class Exercise31 {
	public static void exercise31() {
		//31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран.
		//Посчитать количество двузначных чисел в ней. 
		String message = "Введите количество строк матрицы (n) ";
		int n = enterValue(message);
		String message1 = "Введите количество столбцов матрицы (m) ";
		int m = enterValue(message1);
		int[][] arr = new int[n][m];
		fillArray(arr);
		printArray(arr);
		int count = countArray(arr);
		System.out.println("Количество двузначных чисел " + count);
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
				arr[i][j] = rand.nextInt(1000);
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
	
	private static int countArray(int[][] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(isTwoNumbers(arr[i][j])) {
					count++;
				}
			}
		}
		return count;
	}

	private static boolean isTwoNumbers(int i) {
		boolean twoNumbers = false;
		int count = 0;
		while(i != 0) {
			i = i/10;
			count++;
		}
		if(count == 2) {
			twoNumbers = true;
		}
		return twoNumbers;
	}


}
