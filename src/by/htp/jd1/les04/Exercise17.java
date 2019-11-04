package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise17 {
	public static void exercise17() {
		//17.Натуральное число, в записи которого n цифр, называется числом Армстронга,
		//если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
		//Для решения задачи использовать декомпозицию. 
		System.out.println("Упражнение 17");
		String messageX = "Введите k";
		int k = readIntFromConsole(messageX);
		printNarcissisticNumber(k);
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
	
	public static void printNarcissisticNumber(int k) {
		for(int i = 1; i < k ; i++) {
		boolean isNumber = isNarcissisticNumber(i);
			if(isNumber) {
				System.out.println(i);
		}
		}
	
	}

	public static boolean isNarcissisticNumber(int number) {
		boolean isNarscissistic = true;
		int temp = number;
		int power = countNumerals(number);
		int sum = 0;
		while(number != 0) {
			int numeral = number %10;
			number= (number - numeral)/10;
			sum = sum + (int)(Math.pow(numeral, power));
		}
		if(sum == temp) {
			return isNarscissistic;
		}
		else {
			return !isNarscissistic;
		}
	}

	public static int countNumerals(int number) {
	int count;
		for (count = 0; number != 0; count++) {
			number = number / 10;
		}
		return count;
	}
	
}
