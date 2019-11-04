package by.htp.jd1.les04;

import java.util.Scanner;

public class Exercise1 {
	public static void exercise1() {
		//1. Треугольник задан координатами своих вершин.
		//Написать метод для вычисления его площади.
		System.out.println("Упражнение 1");
		String messageX = "Введите x";
		int x1 = readIntFromConsole(messageX);
		String messageY = "Введите y";
		int y1 = readIntFromConsole(messageY);
		int x2 = readIntFromConsole(messageX);
		int y2 = readIntFromConsole(messageY);
		int x3 = readIntFromConsole(messageX);
		int y3 = readIntFromConsole(messageY);
		double sideA = findDistance(x1, y1, x2, y2);
		double sideB = findDistance(x2, y2, x3, y3);
		double sideC = findDistance(x1, y1, x3, y3);
		double triangleSquare = findTriangleSquare(sideA, sideB, sideC); 
		System.out.println("Площадь равна " + triangleSquare);
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
	
	public static double findDistance(int x1, int y1, int x2, int y2) {
		double distance =Math.sqrt(Math.sqrt(x2 - x1) + Math.sqrt(y2 - y1));
		return distance;
	}
	
	public static double findTriangleSquare(double sideA, double sideB, double sideC) {
		double trianglePerimeter = sideA + sideB + sideC;
		double p = trianglePerimeter / 2;
		double triangleSquare = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		return triangleSquare;
		
	}
	
	
}
