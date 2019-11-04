package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise14 {
	public static void exercise14() {
		//14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. 
		System.out.println("Упражнение 14");
		String message = "Введите число";
		int i = readIntFromConsole(message);
		int n = readIntFromConsole(message);
		int countI = countNumbers(i);
		int countN = countNumbers(n);
		findMoreNumbers(countI, countN);
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
	
	private static int countNumbers(int i) {
		int count = 0;
		while(i > 0) {
			i = i/10;
			count++;
		}
		return count;
	}
	
	private static void findMoreNumbers(int i, int n) {
		if (i > n) {
			System.out.println("Больше цифр в первом числе.");
		}
		else if(n > i) {
			System.out.println("Больше цифр во втором числе.");
		}
		else {
			System.out.println("Одинаковое количество цифр.");
		}
		
	}
	
}
