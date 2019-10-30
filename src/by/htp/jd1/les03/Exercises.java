package by.htp.jd1.les03;
import java.math.BigInteger;

public class Exercises {
	public static void exercise1() {
		//1. Необходимо вывести на экран числа от 1 до 5.
		for(int i = 1; i < 6; i++) {
			System.out.print(i + " ");
		}
	}
	public static void exercise2() {
		//2. Необходимо вывести на экран числа от 5 до 1.
		for(int i = 5; i != 0; i--) {
			System.out.print(i + " ");
		}
	}
	public static void exercise3() {
		//3. Необходимо вывести на экран таблицу умножения на 3:
		System.out.println("Multiplication table");
		int k = 3;
		for(int i = 1; i < 10; i++) {
			int multiplication = k * i;
			System.out.println(i + " * " + k + " = " + multiplication);
		}
	}
	public static void exercise4() {
		//4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
		//от 2 до 100 включительно.
		int i = 2;
		while(i != 101) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
	}
	public static void exercise5() {
		//5. С помощью оператора while напишите программу определения суммы всех нечетных
		//чисел в диапазоне от 1 до 99 включительно.
		int n = 1;
		int sum = 0;
		while(n != 100) {
			if(n % 2 != 0) {
				sum = sum + n;
			}
			n++;
		}
		System.out.println("sum of odd numbers from 1 to 99 is " + sum);
		
	}

	public static void exercise6() {
		//6. Напишите программу, где пользователь вводит любое целое положительное число. А
		//программа суммирует все числа от 1 до введенного пользователем числа.
		int a = 10;
		int sum = 0;
		for(int b = 1; b < (a +1); b++) {
			sum = sum + b;
		}
		System.out.println("sum from 1 to A is " + sum);
	}
	
	public static void exercise7() {
		//7. Вычислить значения функции на отрезке [а,b] c шагом h:
		String str = "Enter a";
		int a = EnterValue.readIntFromConsole(str);
		String str2 = "Enter b";
		int b = EnterValue.readIntFromConsole(str2);
		String str3 = "Enter h";
		int h = EnterValue.readIntFromConsole(str3);
		
		while(a < b){
			int x = a;
			if (x > 2) {
				System.out.print(x + " ");
			}
			else {
				System.out.print(-x + " ");
			}
			a = a + h;
		}
		System.out.println();
	}
	
	public static void exercise9() {
		//9. Найти сумму квадратов первых ста чисел. 
		String str = "The value of 1 * 1 + 2 * 2 + ... + 100 * 100 is ";
		BigInteger value = BigInteger.ZERO;
		int multiple;
		for (int i = 1; i < 101; i++) {
			multiple = i * i;
			BigInteger value2 = BigInteger.valueOf(multiple);
			value = value.add(value2);
		}
		System.out.println(str + value);
	}
	
	public static void exercise10() {
		//10. Составить программу нахождения произведения квадратов первых двухсот чисел. 
		
		String str = "The value of (1 * 1) * (2 * 2) * ... * (200 * 200) is ";
		BigInteger value = BigInteger.ONE;
		for (int i = 2; i <= 200; i++) {
			value = value.multiply(BigInteger.valueOf(i));
		}
		System.out.println(str + value.multiply(value));
	}
	
	public static void exercise11() {
		//11. Составить программу нахождения разности кубов первых двухсот чисел 
		 
		String str = "The value of (200 * 200 * 200) - (199 * 199 * 199) - ... - (1 * 1 * 1) is ";
		int n = 200 * 200 * 200;
		BigInteger value = BigInteger.valueOf(n);
		System.out.println(value);
		int i = 199; 
		while (i != 0) {
			value = value.subtract(BigInteger.valueOf(i * i * i));
			i--;
		}
		System.out.println(str + value);
	}
	
	public static void exercise14() {
		//14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
		String str = "Enter n > 0";
		int n = EnterValue.readIntFromConsole(str);
		double sum = 1d;
		if (n > 0) {
			for (int i = 2; i < n+1; i++) {
				double k = 1.0/i;
				sum += k;
			}
		}
		System.out.println("sum = " + sum);
	}
	
	public static void exercise15() {
		//15. Вычислить : 1+2+4+8+...+ 2 в 10 степени. 
		String str = "Two ten times is ";
		int n = 2;
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum = sum + (int)Math.pow(n, i);
		}
		
		System.out.println(str + sum);
	}
	
	public static void exercise16() {
		//16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
		String str = "The value (1+2)*(1+2+3)*...*(1+2+...+10) is ";
		BigInteger value = BigInteger.ONE;
		int sum = 1;
		for (int i = 2; i < 11; i++) {
			sum = sum + i;
			BigInteger value2 = BigInteger.valueOf(sum);
			value = value.multiply(value2);
		}
		System.out.println(str + value);
	}
	
	public static void exercise17() {
		//17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
		String str = "Enter real a";
		double a = EnterValue.readDoubleFromConsole(str);
		String str2 = "Enter natural n";
		int n = EnterValue.readIntFromConsole(str2);
		double value = 1;
		  for (int i = 1; i < n; i++) {
			  value = value * (a + i);
		  }
		System.out.println("a (a+1)...(a+n-1) = " + value);
	}
	public static void exercise24() {
		//24.Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
		//Преобразовать его в другое число, цифры которого будут следовать в обратном порядке
		//по сравнению с введенным числом.
		String message = "Enter natural number";
		int n = EnterValue.readIntFromConsole(message);
		int m = 0;
		int sum = 0;
		int temp = n;
		int x = 0;
		
		while(n != 0) {
			x = n % 10;
			n = n / 10;
			m = m * 10 + x;
		}
		while (temp !=0) {
			int k = temp % 10;
			if (k % 2 == 0) {
				sum = sum + k;
			}
			temp = temp / 10;
		}
		System.out.println("sum is " + sum + ", m is " + m);
	}
	
	public static void exercise25() {
		//25. Требуется определить факториал числа, которое ввел пользователь.
		String message = "Введите число";
		int n = EnterValue.readIntFromConsole(message);
		BigInteger value = BigInteger.ONE;
		for (int i = 1; i < n + 1; i++) {
			value = value.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(n + "! = " + value);
	}
	
	public static void exercise27() {
		//27. Для каждого натурального числа в промежутке от m до n вывести все делители,
		//кроме единицы и самого числа. m и n вводятся с клавиатуры.
		String message = "Enter natural number m";
		int m = EnterValue.readIntFromConsole(message);
		String message2 = "Enter natural number n";
		int n = EnterValue.readIntFromConsole(message2);
		while(m != n) {
			System.out.print(m + ": ");
			for (int i = 2; i < 10; i ++) {
				if (m % i == 0) {
					System.out.print(i + " ");
				}
			}
			m++;
			System.out.printf("\n");
		}	
	}

	public static void exercise39() {
		//39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили
		//на 7, то получили исходное число. Найти это число.
			for(int i39 = 100; i39 != 1000; i39++) {
				int c = i39;
				int z = c % 10;
				c = c/10;
				int y = c % 10;
				if (i39 == (70 * y + 7 * z)) {
					System.out.print(i39 + " ");
				}
			}
	}

}
