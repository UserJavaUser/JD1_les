package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise6 {
	public static void exercise6() {
		//6. Вычислить площадь правильного шестиугольника со стороной а,
		//используя метод вычисления площади треугольника. 
		System.out.println("Упражнение 6");
		String messageX = "Введите сторону";
		int x = readIntFromConsole(messageX);
		double area = findArea(x); 
		System.out.println("Площадь равна " + area);
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
	

	public static double findTriangleArea(int side) {
		double area = side * side * Math.sqrt(3)/4;
		return area;
		
	}
	
	private static double findArea(int x) {
		double area = 6 * findTriangleArea(x);
		return area;
	}
	
}
