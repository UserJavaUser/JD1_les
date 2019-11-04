package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise8 {
	public static void exercise8() {
		//8. Составить программу, которая в массиве A[N] находит второе по величине число 
		//(вывести на печать число, которое меньше максимального элемента массива,
		//но больше всех других элементов). 
		System.out.println("Упражнение 8");
		String message = "Введите количество элементов массива";	
		int i = readIntFromConsole(message);
		int[] arr = new int[i];
		arr = fillArrayFromConsole(arr, i);
		int max = findMaxFromArray(arr);
		int[] arr2 = fillArray(arr, max);
		int max2 = findMaxFromArray(arr2);
		System.out.println(max2);
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
	
	public static int findMaxFromArray(int[] arr){
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}
	
	private static int[] fillArray(int[] arr, int max) {
		int[] arr2 = new int[arr.length -1];
		for(int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != arr[max]) {
				arr[j] = arr[i];
				j++;
			}
		}
		return arr2;
	}
	
}
