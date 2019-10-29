package by.htp.jd1.les03;
import java.util.Random;
import java.util.Scanner;

public class EnterValue {
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
	
	public static int randomInt() {
		int i = (int)(Math.random() * 100 - 10);
		return i;
	}
	
	public static double randomDouble() {		
		double i = Math.random() * 100 - 10;
		return i;
	}


	public static char readCharFromConsole(String message) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int randomInt2(int k) {
		Random r = new Random();
		int i = r.nextInt(k);
		return i;
	}


	
}
