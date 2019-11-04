package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise16 {
	public static void exercise16() {
		//16. Два простых числа называются «близнецами»,
		//если они отличаются друг от друга на 2 (например, 41 и 43).
		//Найти и напечатать все пары «близнецов» из отрезка [n,2n],
		//где n - заданное натуральное число больше 2.
		//Для решения задачи использовать декомпозицию. 
		System.out.println("Упражнение 16");
		String message = "Введите число n";
		int n = readIntFromConsole(message);
		int length = (n - 1) * 2;
		int[] arr = new int[length];
		arr = fillArray(arr, n);
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
	
	private static int[] fillArray(int[] arr, int n) {
		for(int i = 0; i < arr.length; i = i+2) {
			arr[i] = n;
			n = n + 2;
			arr[i+1] = n;
			n = n - 1;
		}
		return arr;
	}
	
	private static void displayArray(int[] arr) {
		for(int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i] + " " + arr[i+1]);
		}
	}
	
}
