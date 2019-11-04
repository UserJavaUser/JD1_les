package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise5 {
	public static void exercise5() {
		//5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
		System.out.println("Упражнение 5");
		String message = "Введите число";
		double first = readDoubleFromConsole(message);
		double second = readDoubleFromConsole(message);
		double third = readDoubleFromConsole(message);
		double max = findMax(first, second, third);
		double min = findMin(first, second, third);
		double sum = findAddition(max, min);
		System.out.println("Cумма равна " + sum);
		
	}
	
	public static double readDoubleFromConsole (String message) {
		double value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextDouble();
		return value;
	}
	
	public static double findMin(double first, double second, double third) {
		double min = first;
		if (second < min) {
			min = second;
		}
		if (third < min) {
			min = third;
		}
		return min;
	}
	
	private static double findMax(double first, double second, double third) {
		double max = first;
		if (second > max) {
			max = second;
		}
		if (third > max) {
			max = third;
		}
		return max;
	}

	private static double findAddition(double max, double min) {
		double sum = max + min;
		return sum;
	}

}
