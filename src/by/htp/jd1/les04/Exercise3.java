package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise3 {
	public static void exercise3() {
		//3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел. 
		System.out.println("Упражнение 3");
		String message = "Введите число";
		int a = readIntFromConsole(message);
		int b = readIntFromConsole(message);
		int c = readIntFromConsole(message);
		int d = readIntFromConsole(message);
		int gcdAB = findGreatestCommonDivisor(a, b);
		int gcdCD = findGreatestCommonDivisor(c, d);
		int gcd = findGreatestCommonDivisor(gcdAB, gcdCD);
		System.out.println("Наибольший общий делитель " + gcdAB);
		System.out.println("Наибольший общий делитель " + gcdCD);
		System.out.println("Наибольший общий делитель " + gcd);
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
	
	public static int findGreatestCommonDivisor(int a, int b) {
		int gcd = 0;
		if(a != b) {
			while(b != 0) {
				int temp = a%b;
				a = b;
				b = temp;
			}
			gcd = a;
		}
		else {
			gcd = a;
		}
		return gcd;
	}
	
}
