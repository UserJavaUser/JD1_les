package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise11 {
	public static void exercise11() {
		//11. Задан массив D. Определить следующие суммы:
		//D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
		//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
		//расположенных элементов массива с номерами от k до m.
		System.out.println("Упражнение 11");
		String message = "Введите количество элементов массива";	
		int i = readIntFromConsole(message);
		int[] arr = new int[i];
		arr = fillArrayFromConsole(arr, i);
		int first = 0;
		int second = 2;
		int third = 3;
		displayArray(arr);
		int sum1 = findSum(arr, first);
		int sum2 = findSum(arr, second);
		int sum3 = findSum(arr, third);
		System.out.println("D[l] + D[2] + D[3] = " + sum1);
		System.out.println("D[3] + D[4] + D[5] = " + sum2);
		System.out.println("D[4] + D[5] + D[6] = " + sum3);
	}
	
	public static int readIntFromConsole (String message) {
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
	
	public static int[] fillArrayFromConsole(int[] arr, int i) {
		String message = "Введите элемент";
		for(int n = 0; n < i; n++ ) {
			arr[n] = readIntFromConsole (message);
		}
		return arr;
	}
	
	private static void displayArray(int[] arr) {
		for(int n = 0; n < arr.length; n++ ) {
			System.out.print(arr[n] + " ");
		}
		System.out.printf("\n");
	}
	
	private static int findSum(int[] arr, int first) {
		int sum = 0;
		int n = first;
		while(n != first + 3) {
			sum = sum + arr[n];
			n++; 
		}
		
		return sum;
	}
}
