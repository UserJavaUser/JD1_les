package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise4 {
	public static void exercise4() {
		//4. Написать метод(методы) для нахождения наименьшего общего кратного
		//трех натуральных чисел
		System.out.println("Упражнение 4");
		String message = "Введите число";
		int a = readIntFromConsole(message);
		int b = readIntFromConsole(message);
		int c = readIntFromConsole(message);
		int gcdAB = findGreatestCommonDivisor(a, b);
		int lcmAB = findLeastCommonMultiple(a, b, gcdAB);
		int gcdABC = findGreatestCommonDivisor(gcdAB, c);
		int lcmABC = findLeastCommonMultiple(lcmAB, c, gcdABC);
		System.out.println("Наименьшее общее кратное " + lcmABC);
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
	
	public static int findLeastCommonMultiple(int a, int b, int gcd) {
		int lcm = 0;
		lcm = a * b / gcd; 
		return lcm;
	}
}
