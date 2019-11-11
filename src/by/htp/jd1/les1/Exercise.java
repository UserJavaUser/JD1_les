package by.htp.jd1.les1;
import java.math.BigInteger;
import java.util.Random;

public class Exercise {
	public static void exercise1(){
		// 1. Даны два действительных числа х и  у. 
		//Вычислить их сумму, разность, произведение и частное. 
		double x;
		x = Math.random() * 100;
		double y;
		y = Math.random() * 100 - 10;
		double addition = x + y;
		double substraction = x - y;
		double multiplication = x * y;
		double division = x / y;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("сумма: " + addition );
		System.out.println("разность: " + substraction );
		System.out.println("произведение: " + multiplication );
		System.out.println("частное: " + division );
	}
	
	public static void exercise2(){
		//2. Найдите  значение функции: с = 3 + а. 
		double a = Math.random() * 100;
		double c = 3 + a;
		System.out.println(c + "= 3 + " + a );
	}
	
	public static void exercise3(){
		//3. Найдите  значение функции: z = 2 * x + ( y – 2 ) * 5.
		double x3 = Math.random() * 100;
		double y3 = Math.random() * 100;
		double z = 2 * x3 + ( y3 - 2 ) * 5;
		System.out.println("Найдите  значение функции:  z = 2 * x + ( y – 2 ) * 5");
		System.out.println("x = " + x3);
		System.out.println("y = " + y3);
		System.out.println("z = " + z);
	}
	public static void exercise4(){
		//4. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
		double a = Math.random() * 100;
		double b = Math.random() * 100;
		double c = Math.random() * 100;
		double z = ( (a - 3 ) * b / 2) + c;
		System.out.println("Найдите  значение функции:  z = ( (a – 3 ) * b / 2) + c)");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("z = " + z);
	}
	
	public static void exercise5(){
		//5. Составить алгоритм нахождения среднего арифметического двух чисел 
		Random rand = new Random();
		double x5 = rand.nextDouble();
		double y5 = rand.nextDouble();
		double averageXY = (x5 + y5) / 2;
		System.out.println("Cреднее арифметическое х = " + x5 + " и y = " + y5 + " это " + averageXY);
	}
	public static void exercise6(){
		//6. Написать код для решения задачи. 
		// В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
		//если в каждом большом бидоне на 12 л. больше, чем в малом? 
		String message = "Введите n (малые бидоны молока) ";
		int n = EnterValue.readIntFromConsole(message);
		String message2 = "Введите m (большие бидоны молока) ";
		int m = EnterValue.readIntFromConsole(message2);
		int milk = (80/n + 12) * m;
		System.out.println("В больших бидонах " + milk + " литров молока");
	}
	public static void exercise7(){
		//7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
		Random rand = new Random();
		double width = rand.nextDouble();
		double length = width * 2;
		double square = width * length;
		System.out.print("Площадь прямоугольника с шириной " + width + " и длиной " + length + " равна ");
		System.out.println(square);
	}
	public static void exercise8(){
		//8. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏 + √𝑏2 + 4𝑎𝑐 2𝑎 − 𝑎3𝑐 + 𝑏−2 
		Random rand = new Random();
		double a8 = rand.nextDouble();
		double b8 = rand.nextDouble();
		double c8 = rand.nextDouble();
		double value8 = (b8 + Math.sqrt(b8 * b8 + 4 * a8 * c8))/2 *a8 - Math.pow(a8, 3) * c8 + Math.pow(b8, -2);
		System.out.println("Значение выражения " + value8);
	}
	
	public static void exercise9(){
		//9. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑎 /𝑐 ∗ 𝑏/𝑑 − (𝑎𝑏 − 𝑐)/𝑐𝑑
		Random rand = new Random();
		double a9 = rand.nextDouble();
		double b9 = rand.nextDouble();
		double c9 = rand.nextDouble();
		double d9 = rand.nextDouble();
		double value9 = (a9 / c9) * (b9 / d9) - (a9 * b9 - c9) / c9 * d9;
		System.out.println("Значение выражения " + value9);
	}
	
	public static void exercise10() {
		//10. Вычислить значение выражения по формуле (все переменные принимают действительные значения): (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) ∗ 𝑡𝑔 𝑥𝑦 
		Random rand = new Random();
		double x10 = rand.nextDouble();
		double y10 = rand.nextDouble();
		double value10 = ((Math.sin(x10) + Math.cos(y10)) / (Math.cos(x10) - Math.sin(y10))) * Math.tan(x10 * y10);
		System.out.println("Значение выражения " + value10);
	}
	
	public static void exercise11() {
		//11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов. 
		Random rand = new Random();
		double side1 = rand.nextDouble();
		double side2 = rand.nextDouble();
		double side3 = Math.sqrt( side1 * side1 + side2 * side2); 
		double perimeter = side1 + side2 + side3;
		double squareOfTriangle = side1 * side2 / 2;
		System.out.println("Периметр " + perimeter + ", площадь " + squareOfTriangle);
	}
	
	public static void exercise12() {
		//12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
		Random rand = new Random();
		double x1 = rand.nextDouble();
		double x2 = rand.nextDouble();
		double y1 = rand.nextDouble();
		double y2 = rand.nextDouble();
		double distance = Math.sqrt(Math.sqrt(x2 - x1) + Math.sqrt(y2 - y1)); 
		System.out.println("Расстояние между точками (" + x1 + "," + y1 + ")" + "," + "(" + x2 + "," + y2 + ") равно " + distance);
	}
	
	public static void exercise13() {
		//13. Заданы координаты трех вершин треугольника  (х1 у2),(х2, у2),(х3, у3). Найти его периметр и площадь.
		String messageX = "Enter x";
		int x1 = EnterValue.readIntFromConsole(messageX);
		String messageY = "Enter y";
		int y1 = EnterValue.readIntFromConsole(messageY);
		int x2 = EnterValue.readIntFromConsole(messageX);
		int y2 = EnterValue.readIntFromConsole(messageY);
		int x3 = EnterValue.readIntFromConsole(messageX);
		int y3 = EnterValue.readIntFromConsole(messageY);
		double sideA = Mathematics.findDistance(x1, y1, x2, y2);
		double sideB = Mathematics.findDistance(x2, y2, x3, y3);
		double sideC = Mathematics.findDistance(x1, y1, x3, y3);
		double trianglePerimeter = sideA + sideB + sideC;
		double p = trianglePerimeter / 2;
		double triangleSquare = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); 
		System.out.println("Периметр равен " + trianglePerimeter + " и площадь равна " + triangleSquare);
	}
	
	public static void exercise14() {
		//14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
		String message = "Enter radius";
		int r = EnterValue.readIntFromConsole(message);
		double l = 2 * Math.PI * r;
		double area = 2 * Math.PI * r * r;
		System.out.println("Длина окружности = " + l + " и площадь равна " + area);
	}
	
	public static void exercise15() {
		//15. Написать программу, которая выводит на экран первые четыре степени числа π. 
		System.out.println("Четыре первые степени числа PI");
		System.out.println(Math.pow(Math.PI,1));
		System.out.println(Math.pow(Math.PI,2));
		System.out.println(Math.pow(Math.PI,3));
		System.out.println(Math.pow(Math.PI,4));
	}
	
	public static void exercise16() {
		//16. Найти произведение цифр заданного четырехзначного числа.
		String str = ("Введите четырехзначное число");
		int i = EnterValue.readIntFromConsole(str);
		int first = i % 10;
		i = (i - first) / 10;
		int second = i % 10;
		i = (i - second )/ 10;
		int third = i % 10;
		i = (i - third) / 10;
		int fourth = i;
		
		int multiple = first * second * third * fourth;
		System.out.println("Произведение цифр заданного четырехзначного числа " + multiple);
	}
	
	public static void exercise17() {
		//17. Даны два числа.
		//Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел. 
		String str = ("Введите первое число");
		int x = EnterValue.readIntFromConsole(str);
		String str2 = ("Введите второе число");
		int y = EnterValue.readIntFromConsole(str2);
		BigInteger average = BigInteger.valueOf((x * x * x + y * y * y) / 2);
		BigInteger geometricMean = BigInteger.valueOf((long) Math.sqrt( Math.abs(x) * Math.abs(y)));
		System.out.println("среднее арифметическое кубов = " + average);
		System.out.println("среднее геометрическое модулей = " + geometricMean);
		
	}
	
	public static void exercise18() {
		//18.  Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба. 
		String str = "Длина ребра куба ";
		int a = EnterValue.randomInt2(30);
		System.out.println(str + a);
		int area1 = a * a;
		int area2 = 6 * area1;
		int cubeVolume = (int) Math.pow(a, 3);
		System.out.print("площадь грани = " + area1);
		System.out.println(" , площадь полной поверхности = " + area2 + " , объем куба = " + cubeVolume);
	}
	
	public static void exercise19() {
		//19. Дана сторона равностороннего треугольника.
		//Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
		String str = "Cторона треугольника ";
		int side = EnterValue.randomInt2(30);
		System.out.println(str + side);
		double area = side * side * Math.sqrt(3)/4;
		double h = Math.sqrt(3)/2 *side;
		double radius1 = area/(side * 3 / 2);
		double radius2 = (side * side * side) / 4 * area;
		System.out.print("площадь треугольника = " + area);
		System.out.print(", высота треугольника = " + h);
		System.out.print(", радиусы вписанной окружности = " + radius1);
		System.out.println(", радиус описанной окружности = " + radius2);

	}
	
	public static void exercise20() {
		//20.Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
		String str = "Введите длину окружности ";
		double l = EnterValue.readDoubleFromConsole(str);
		double radius = l/2 * Math.PI;
		double area = Math.PI * radius * radius;
		System.out.println("Площадь круга = " + area);
	}
	
	public static void exercise21() {
		//21. Дано действительное число R вида nnn.ddd
		//(три цифровых разряда в дробной и целой частях).
		//Поменять местами дробную и целую части числа и вывести полученное значение числа.
		String str = "Введите действительное число R вида nnn.ddd";
		double r = EnterValue.readDoubleFromConsole(str);
		double x = r * 1000 % 1000;
		System.out.println("ddd = " + x);
		double y = r - x/1000;
		System.out.println("nnn = " + y);
		r = x + y/1000;
		System.out.println("r = " + r);
	}

	public static void exercise22() {
			//22. Дано натуральное число Т, которое представляет длительность прошедшего времени в
			//секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей
			//форме: Нч ММмин SSc.
			String str = "Введите длительность прошедшего времени в cекундах";
			int t = EnterValue.readIntFromConsole(str);
			int hour = t /3600;
			int min = (t - hour * 3600) / 60;
			int sec = t - hour * 3600 - min * 60;
			System.out.println(hour + " ч " + min + " мин " + sec + "сек");

	}
	
	
	
}

