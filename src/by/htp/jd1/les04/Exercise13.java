package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise13 {
	public static void exercise13() {
		//13. Дано натуральное число N.
		//Написать метод(методы) для формирования массива,
		//элементами которого являются цифры числа N. 
		System.out.println("Упражнение 13");
		String message = "Введите число";	
		int i = readIntFromConsole(message);
		int length = findLength(i);
		int[] arr = new int[length];
		arr = fillArray(arr, i);
		displayArray(arr);
	
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
	
	private static int findLength(int i) {
		int count = 0;
		while( i != 0) {
			i = i / 10;
			count++;
		}
		return count;
	}
	
	private static int[] fillArray(int[] arr, int i) {
		for(int n = 0; n < arr.length; n++ ) {
			arr[n] = i % 10;
			i = i / 10;
		}
		return arr;
	}
	
	public static void displayArray(int[] arr) {
		for(int n = 0; n < arr.length; n++ ) {
			System.out.println("[ " + n + " ]" + " = " + arr[n]);
		}
	}
	
}
