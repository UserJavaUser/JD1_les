package by.htp.jd1.les5;

public class Exercises {
	public static void exercise1() {
		//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны
		//данному К.
		System.out.println("Упражнение 1");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		String message1 = "Введите число, которому должны быть кратны элементы";	
		int k = EnterValue.readIntFromConsole(message1);
		
		int[] arr = new int[i];
		EnterValue.fillArray(arr, i);
		EnterValue.displayArray(arr);
		int sum = EnterValue.sumElements(arr, k);
		System.out.println("Сумма элементов, кратных " + k + " равна " + sum);
	}
	
	public static void exercise2() {
		//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров
		//этих элементов.
		System.out.println("Упражнение 2");
		int[] arr = {12, 5, 0, 34, 67, 89, 0};
		System.out.println("Первый массив");
		EnterValue.displayArray(arr);
		int k = 0;
		int n = EnterValue.findZeroElements(arr, k);
		int[] arr2 = EnterValue.fillArrayWithElements(n, arr, k);
		System.out.println("Второй массив");
		EnterValue.displayArray(arr2);
	}
	
	public static void exercise3() {
		//3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается
		//раньше - положительное или отрицательное.
		System.out.println("Упражнение 3");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		int[] arr = new int[i];
		arr = EnterValue.fillArrayFromConsole(arr, i);
		EnterValue.displayArray(arr);
		if (arr[0] > 0) {
			System.out.println("Раньше встречается положительное");
		}
		else {
			System.out.println("Раньше встречается отрицательное");
		}

	}
	
	public static void exercise4() {
		//4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она
		//возрастающей.
		System.out.println("Упражнение 4");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		double[] arr = new double[i];
		arr = EnterValue.fillArrayDoubleFromConsole(arr, i);
		EnterValue.displayDoubleArray(arr);;
		boolean isIncreasingSequence = EnterValue.increase(arr);
		if (isIncreasingSequence) {
			System.out.println("Последовательность возрастающая");
		}
		else {
			System.out.println("Последовательность не возрастающая");
		}
	}
	
	public static void exercise5() {
		//5. Дана последовательность натуральных чисел а1 , а2 ,..., аn.
		//Создать массив из четных чисел этой последовательности.
		//Если таких чисел нет, то вывести сообщение об этом факте.
		System.out.println("Упражнение 5");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		int[] arr = new int[i];
		arr = EnterValue.fillArrayFromConsole(arr, i);
		EnterValue.displayArray(arr);
		int len;
		len = EnterValue.countEvenElements(arr);
		if (len == 0) {
			System.out.println("Четных чисел нет");
		}
		else {
			int[] arr2 = new int[len];
			arr2 = EnterValue.fillArrayFromArray(arr, arr2);
			System.out.println("Последовательность из четных элементов");
			EnterValue.displayArray(arr2);
		}	
	}
	
	public static void exercise6() {
		//6. Дана последовательность чисел а1 ,а2 ,..., аn.
		//Указать наименьшую длину числовой оси, содержащую все эти числа.
		System.out.println("Упражнение 6");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		int[] arr = new int[i];
		arr = EnterValue.fillArrayFromConsole(arr, i);
		EnterValue.displayArray(arr);
		int length = EnterValue.findNumberLine(arr);
		System.out.println(length);
	}
	
	public static void exercise7() {
		//7. Дана последовательность действительных чисел а1 ,а2 ,..., аn.
		//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
		System.out.println("Упражнение 7");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		double[] arr = new double[i];
		arr = EnterValue.fillArrayDoubleFromConsole(arr, i);
		EnterValue.displayDoubleArray(arr);
		String message2 = "Введите число Z";	
		int z = EnterValue.readIntFromConsole(message2);
		arr = EnterValue.changeElementsWithZ(arr, z);
		EnterValue.displayDoubleArray(arr);
		int count = EnterValue.countArrayElements(arr, z);
		System.out.println(count);
	}
	
	public static void exercise9() {
		//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший
		//элементы.
		System.out.println("Упражнение 9");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		double[] arr = new double[i];
		arr = EnterValue.fillArrayDoubleFromConsole(arr, i);
		EnterValue.displayDoubleArray(arr);
		arr = EnterValue.changeElements(arr);
		EnterValue.displayDoubleArray(arr);
		
	}
	
	public static void exercise10() {
		//10. Даны целые числа а1 ,а2 ,..., аn .
		//Вывести на печать только те числа, для которых аi > i.
		System.out.println("Упражнение 10");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		int[] arr = new int[i];
		arr = EnterValue.fillArrayFromConsole(arr, i);
		EnterValue.displayArray(arr);
		EnterValue.printElements(arr);

	}
	
	public static void exercise12() {
		//12. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		//порядковые номера которых являются простыми числами.
		System.out.println("Упражнение 12");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		double[] arr = new double[i];
		arr = EnterValue.fillArrayDoubleFromConsole(arr, i);
		EnterValue.displayDoubleArray(arr);
		double sum = EnterValue.sumElementsIfPrime(arr);
		System.out.println(sum);

	}
	
	public static void exercise14() {
		//14.  Дан одномерный массив A[N].
		System.out.println("Упражнение 14");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		int[] arr = new int[i];
		arr = EnterValue.fillArrayFromConsole(arr, i);
		EnterValue.displayArray(arr);
		int[] arr1 = EnterValue.fillArrayWithOddNumbersOfElements(arr);
		EnterValue.displayArray(arr1);
		int[] arr2 = EnterValue.fillArrayWithEvenNumbersOfElements(arr);
		EnterValue.displayArray(arr2);
		int max = EnterValue.findMaxFromArray(arr1);
		int min = EnterValue.findMinFromArray(arr2);
		int sum = arr1[max] + arr2[min];
		System.out.println("Сумма равна " + sum);
		
	}
	
	public static void exercise15() { 
		//15. Дана последовательность действительных чисел. Указать те ее элементы, 
		//которые принадлежат отрезку [с, d].
		System.out.println("Упражнение 15");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		double[] arr = new double[i];
		arr = EnterValue.fillArrayDoubleFromConsole(arr, i);
		EnterValue.displayDoubleArray(arr);
		String message1 = "Введите число с";	
		double c = EnterValue.readDoubleFromConsole(message1);
		String message2 = "Введите число d";	
		double d = EnterValue.readDoubleFromConsole(message2);
		int[] arr2 = EnterValue.findElementsFromRange(arr, c, d);
		EnterValue.displayArray2(arr2);
	}
	
	public static void exercise17() {
		//17. Дана последовательность целых чисел.
		//Образовать новую последовательность, выбросив из исходной те члены,
		//которые равны min.
		System.out.println("Упражнение 17");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		int[] arr = new int[i];
		arr = EnterValue.fillArrayFromConsole(arr, i);
		EnterValue.displayArray(arr);
		int min = EnterValue.findMinFromArray(arr);
		int[] arr1 = EnterValue.fillArrayExceptElements(arr, min);
		EnterValue.displayArray(arr1);
	}
	
	public static void exercise19() {
		//19.В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
		//Если таких чисел несколько, то определить наименьшее из них.
		System.out.println("Упражнение 19");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		int[] arr = new int[i];
		arr = EnterValue.fillArrayFromConsole(arr, i);
		EnterValue.displayArray(arr);
		int[] arr2 = EnterValue.ElementsFrequency(arr);
		EnterValue.displayArray(arr2);
		int frequent = EnterValue.findFrequentFromArray(arr, arr2);
		
		System.out.println(arr[frequent]);
	}
	
	public static void exercise20() {
		//20. Дан целочисленный массив с количеством элементов n.
		//Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
		//Примечание. Дополнительный массив не использовать.
		System.out.println("Упражнение 20");
		String message = "Введите количество элементов массива";	
		int i = EnterValue.readIntFromConsole(message);
		int[] arr = new int[i];
		arr = EnterValue.fillArrayFromConsole(arr, i);
		arr = EnterValue.changeArray(arr);
		EnterValue.displayArray(arr);
	}
}
