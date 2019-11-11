package by.htp.jd1.les7;

public class Exercise1 {
	public static void exercise1() {
		//1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так,
		//чтобы в одной строке была ровно одна единица, и вывести на экран.
		int[][] arr = new int[3][4];
		fillArray(arr);
		printArray(arr);
	}

	private static void fillArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = 0;
				}
			}
		}
		
	}

	private static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
