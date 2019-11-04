package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise10 {
	public static void exercise10() {
		//10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 
		System.out.println("Упражнение 10");
		int[] arr = new int[9];
		arr = fillArrayWithElements(arr);
		findFactorial(arr);
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
	
	private static int[] fillArrayWithElements(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		return arr;
	}

	private static void findFactorial(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				int factorial = factorial(arr[i]);
				System.out.println(arr[i] + "! = " + factorial);
			}
		}
	}

	private static int factorial(int i) {
		int factorial = 1;
		for(int n = 1; n < i + 1; n++) {
			factorial = factorial * n;
		}
		return factorial;
	}
	
	
}
