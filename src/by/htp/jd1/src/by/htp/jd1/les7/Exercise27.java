package by.htp.jd1.les7;

import java.util.Scanner;

public class Exercise27 {
	public static void exercise27() {
		//27. В числовой матрице поменять местами два столбца любых столбца,
		//т. е. все элементы одного столбца поставить на соответствующие им позиции
		//другого, а его элементы второго переместить в первый.
		//Номера столбцов вводит пользователь с клавиатуры. 

		String message = "Введите количество строк матрицы (n) ";
		int n = enterValue(message);
		String message1 = "Введите количество столбцов матрицы (m) ";
		int m = enterValue(message1);
		int[][] arr = new int[n][m];
		fillArray(arr);
		printArray(arr);
		String message2 = "Введите первый столбец, который необходимо поменять";
		int m1 = enterValue(message2);;
		while(m1 >= m || m1 < 0) {
			m1 = enterValue(message2);
		}
		String message3 = "Введите второй столбец, который необходимо поменять";
		int m2 = enterValue(message3);
		while(m2 >= m || m2 < 0) {
			m2 = enterValue(message3);
		}
		arr = changeArray(arr, m1, m2);
		printArray(arr);
	}

	private static int enterValue(String message) {
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

	private static void fillArray(int[][] arr) {
		String message2 = "Введите элемент массива";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = enterValue(message2);
			}
		}
	}
	
	private static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
		System.out.println();
		}
	}
	
	private static int[][] changeArray(int[][] arr, int m1, int m2) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j  == m1) {
					temp = arr[i][j];
					arr[i][j] = arr[i][m2];
					arr[i][m2] = temp;
				}	
			}
		}
		return arr;
	}

}
