package by.htp.jd1.les5;
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


	public static void fillArray(int[] arr, int i) {
		for(int n = 0; n < i; n++ ) {
			arr[n] = randomInt();
		}
		
	}
	
	public static int[] fillArrayFromConsole(int[] arr, int i) {
		String message = "Введите элемент";
		for(int n = 0; n < i; n++ ) {
			arr[n] = readIntFromConsole (message);
		}
		return arr;
	}
	


	public static int sumElements(int[] arr, int k) {
		int sum = 0;
		for(int n = 0; n < arr.length; n++ ) {
			if(arr[n] % k == 0) {
				sum = sum + arr[n];
			}
		}
		return sum;
	}


	public static void displayArray(int[] arr) {
		for(int n = 0; n < arr.length; n++ ) {
			System.out.println("[ " + n + " ]" + " = " + arr[n]);
		}
		
	}


	public static void displayArray2(int[] arr) {
		for(int n = 0; n < arr.length; n++ ) {
			System.out.print(arr[n] + " ");
		}
		System.out.println();
	}
	
	public static int findZeroElements(int[] arr, int i) {
		int count = 0;
		for(int n = 0; n < arr.length; n++ ) {
			if(arr[n] == i) {
				count++;
			}
		}
		return count;
	}


	public static int[] fillArrayWithElements(int n, int[] arr, int k) {
		int[] mas = new int[n];
		for(int i = 0,j = 0; i < arr.length; i++ ) {
			if(arr[i] == k) {
				mas[j] = i;
				j++;
			}
 		}
		return mas;
	}


	public static boolean increase(double[] arr) {
		boolean isIncreasing = true;
		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i] > arr[i+1]) {
				isIncreasing = false;
			}
		}
		return isIncreasing;
	}


	public static int countEvenElements(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}


	public static int[] fillArrayFromArray(int[] arr, int[] arr2) {
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr2[k] = arr[i];
				k++;
			}
		}
		return arr2;
	}
	
	public static int findMaxFromArray(int[] arr){
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}
	
	public static int findMinFromArray(int[] arr){
		int min = 0;
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[min]) {
				min = i;
			}
		}
		return min;
	}

	public static int findMaxDoubleFromArray(double[] arr){
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static int findMinDoubleFromArray(double[] arr){
		int min = 0;
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = i;
			}
		}
		return min;
	}
	
	public static int findNumberLine(int[] arr) {
		int length = 0;
		int min = findMaxFromArray(arr);
		int max = findMinFromArray(arr);
		length = Math.abs(arr[max] - arr[min]);
		return length;
	}


	public static double[] fillArrayDoubleFromConsole(double[] arr, int i) {
		String message = "Введите элемент";
		for(int n = 0; n < i; n++ ) {
			arr[n] = readDoubleFromConsole (message);
		}
		return arr;
		
	}


	public static void displayDoubleArray(double[] arr) {
		for(int n = 0; n < arr.length; n++ ) {
			System.out.println("[ " + n + " ]" + " = " + arr[n]);
		}
	}


	public static double[] changeElementsWithZ(double[] arr, int z) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
			}
		}
		return arr;
	}


	public static int countArrayElements(double[] arr, int z) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == z) {
				count++;
			}
		}
		return count;
	}
	
	public static void printElements(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > i) {
				System.out.println("[" + i + "] = " + arr[i]);
			}
		}
		
	}


	public static double sumElementsIfPrime(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i ++) {
			if (!findPrime(i)) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}
	
	public static boolean findPrime(int i) {
		boolean isPrime = false;
		for (int n = 2; n < 10; n ++) {
			if (i % n == 0) {
				isPrime = true;
				return isPrime;
			}
		}
		return isPrime;
	}


	public static double[] changeElements(double[] arr) {
		int max = findMaxDoubleFromArray(arr);
		int min = findMinDoubleFromArray(arr);
		double temp = arr[max];
		arr[max] = arr[min];
		arr[min] = temp;
		return arr;
	}


	public static int[] fillArrayWithOddNumbersOfElements(int[] arr) {
		int n = (arr.length - 1)/ 2;
		int[] arr1 = new int[n];
		for(int i = 1, j = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				arr1[j] = arr[i];
				j++;
			}
		}
		return arr1;
	}
	
	public static int[] fillArrayWithEvenNumbersOfElements(int[] arr) {
		int n = (arr.length - 1)/ 2;
		int[] arr1 = new int[n];
		for(int i = 1, j = 0; i < arr.length; i++) {
			if(i % 2 != 0) {
				arr1[j] = arr[i];
				j++;
			}
		}
		return arr1;
	}

	public static int[] findElementsFromRange(double[] arr, double c, double d) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] > c) && (arr[i] < d)) {
				count++;
			}
		}
		
		int[] arr2 = new int[count];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if ((arr[i] > c) && (arr[i] < d)) {
				arr2[j] = i;
				j++;
			}
		}
		
		return arr2;
	}


	public static int[] fillArrayExceptElements(int[] arr, int min) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[min]) {
				count++;
			}
		}
		
		int[] arr2 = new int[count];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != arr[min]) {
				arr2[j] = arr[i];
				j++;
			}
		}
		return arr2;
	}


	public static int[] ElementsFrequency(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for(int j = i+1; j < arr.length-1; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			arr1[i] = count;
		}
		
		return arr1;
	}


	public static int findFrequentFromArray(int[] arr, int[] arr2) {
		int max = 0;
		for(int i = 1; i < arr2.length; i++) {
			if (arr2[i] > arr2[max]) {
				max = i;
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if ((arr[i] < arr[max]) && (arr2[i] == arr2[max])) {
				max = i;
			}
		}
		
		return max;
		
	}


	public static int[] changeArray(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if ((i % 2) !=0) {
				arr[i] = 0;
			}
		}
		return arr;
	}
	
	

	
}
