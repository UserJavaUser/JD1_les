package by.htp.jd1.les2;

public class Exercises {
	public static void exercise1(){
	//  Составить программу сравнения двух чисел 1 и 2. 
	//Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8. 
		String message = "Enter number";
		int x = EnterValue.readIntFromConsole(message);
		int y = EnterValue.readIntFromConsole(message);;
		
		if (x < y) {
			System.out.println("7");
		}
		if (x > y) {
			System.out.println("8");
		}

			System.out.println();
	}		
	
	public static void exercise2(){
		//2. Составить программу сравнения двух чисел 1 и 2.
		//Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no» 
		String message = "Enter number";
		double first = EnterValue.readDoubleFromConsole(message);
		double second = EnterValue.readDoubleFromConsole(message);
		if(first < second) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		System.out.println();
	}
	
	public static void exercise3(){
		//3. Составить программу сравнения введенного числа а и цифры 3.
		//Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no». 
		String message = "Enter number";
		int z = EnterValue.readIntFromConsole(message);
		if (z > 3) {
			System.out.println("yes");	
		}
		else {
			System.out.println("no");
		}
		System.out.println();
	}
	
	public static void exercise4(){
		//4. Составить программу:  равны ли два числа а и b?
		String message = "Enter number";
		double a = EnterValue.readDoubleFromConsole(message);
		double b = EnterValue.readDoubleFromConsole(message);
		System.out.println("First number is " + a);
		System.out.println("First number is " + b);
		if(a == b) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		System.out.println();
	}
	
	public static void exercise5(){
		//5. Составить программу: определения наименьшего из двух чисел а и b.
		String message = "Enter number";
		double a = EnterValue.readDoubleFromConsole(message);
		double b = EnterValue.readDoubleFromConsole(message);
		System.out.println("First number is " + a);
		System.out.println("First number is " + b);
		System.out.print("The smaller number is ");
		if(a > b) {
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}
		System.out.println();
	}
	
	public static void exercise6(){
		//6. Составить программу: определения наибольшего из двух чисел а и b.
		String message = "Enter number";
		double a = EnterValue.readDoubleFromConsole(message);
		double b = EnterValue.readDoubleFromConsole(message);
		System.out.println("First number is " + a);
		System.out.println("First number is " + b);
		System.out.print("The greater number is ");
		if(a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
			System.out.println();
	}
	
	public static void exercise7(){
		//7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
		String message = "Enter number";
		int a = EnterValue.readIntFromConsole(message);
		int b = EnterValue.readIntFromConsole(message);
		int c = EnterValue.readIntFromConsole(message);
		int x = EnterValue.readIntFromConsole(message);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("x = " + x);
		int value = Math.abs(a*x*x + b*x + c);
		System.out.println("The absolute value of a number is " + value);
	}
	
	public static void excercise8(){
		//8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		String message = "Enter number";
		int a = EnterValue.readIntFromConsole(message);
		int b = EnterValue.readIntFromConsole(message);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int aPower = (int)(Math.pow(a, 2));
		int bPower = (int)(Math.pow(b, 2));
		if(aPower > bPower) {
			System.out.println("The squaring " + bPower + " is the smallest");
		}
		else {
			System.out.println("The squaring " + aPower + " is the smallest");
		}
		
	}
	
	public static void excercise9() {
		//9. Составить программу, которая определит по трем введенным сторонам,
		//является ли данный треугольник равносторонним. 
		String message = "Enter side of the triangle";
		int sideA = EnterValue.readIntFromConsole(message);
		int sideB = EnterValue.readIntFromConsole(message);
		int sideC = EnterValue.readIntFromConsole(message);
		if ((sideA == sideB) && (sideB == sideC)) {
			System.out.println("The triangle is equaliteral");
		}
		else {
			System.out.println("The triangle isn't equaliteral");
		}
	}
	
	public static void excercise10() {
		//10. Составить программу, которая определит площадь какого круга меньше.
		String message = "Area of the circle";
		System.out.println(message);
		int areaA = EnterValue.randomInt();
		int areaB = EnterValue.randomInt();
		System.out.println("area A = " + areaA + ", area B = " + areaB);
		if (areaA > areaB) {
			System.out.println("The first area is greater");
		}
		else {
			System.out.println("The second area is greater");
		}
	}
	
	public static void excercise11() {
		//11. Составить программу, которая определит площадь какого треугольника больше.
		String message = "Areas of the triangle are";
		System.out.println(message);
		int areaA = EnterValue.randomInt();
		int areaB = EnterValue.randomInt();
		System.out.println("area A = " + areaA + ", area B = " + areaB);
		if (areaA > areaB) {
			System.out.println("The first triangle is greater");
		}
		else {
			System.out.println("The second triangle is greater");
		}
	}
	
	public static void excercise12() {
		//12. Даны три действительных числа
		//Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные. 
		String message = "Real numbers are";
		System.out.println(message);
		double a = EnterValue.randomDouble();
		double b = EnterValue.randomDouble();
		double c = EnterValue.randomDouble();
		double d = EnterValue.randomDouble();
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
		int power1 = 2;
		int power2 = 4;
		a = Mathematics.powerValue(a, power1, power2);
		b = Mathematics.powerValue(b, power1, power2);
		c = Mathematics.powerValue(c, power1, power2);
		d = Mathematics.powerValue(d, power1, power2);
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
	}
	
	public static void excercise13() {
		//13. Даны две точки А(х1, у1) и В(х2, у2).
		//Составить алгоритм, определяющий, которая из точек находится ближе к началу координат
		String message = " Coordinates are";
		System.out.println(message);
		int x1 = EnterValue.randomInt();
		int y1 = EnterValue.randomInt();
		int x2 = EnterValue.randomInt();
		int y2 = EnterValue.randomInt();
		System.out.println("x1 = " + x1 + ", y1 = " + y1 + ", x2 =" + x2 + ", y2 = " + y2);
		//origin (0,0)
		int x0 = 0;
		int y0 = 0;
		double distance1 = Mathematics.findDistance(x0, y0, x1, y1);
		double distance2 = Mathematics.findDistance(x0, y0, x2, y2);
		if (distance1 < distance2) {
			System.out.println("The first dot is closer to the origin");
		}
		else {
			System.out.println("The second dot is closer to the origin");
		}
	}
	
	public static void excercise14() {
		//14. Даны два угла треугольника (в градусах).
		//Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. 
		String message = "The two angles of triangle are";
		System.out.println(message);
		int x = EnterValue.randomInt();
		int y = EnterValue.randomInt();
		System.out.println("first angle is " + x + ", second angle is " + y);
		boolean isTriangle = Mathematics.findTriangle(x, y);
		if (isTriangle) {
			System.out.println("The triangle is exists");
		}
		boolean isRectangular = false;
		if (isTriangle) {
			isRectangular = Mathematics.findRectangularTriangle(x, y);
		}
		if (isRectangular){
			System.out.println("The triangle is rectangular");
		}
	}
	
	public static void exercise15() {
		//15. Даны действительные числа х и у, не равные друг другу.
		//Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.  
		String message = "The two real numbers are";
		System.out.println(message);
		double x = EnterValue.randomDouble();
		double y = EnterValue.randomDouble();
		System.out.println("first real number is " + x + ", second real number is " + y);
		double sum = x + y;
		double multiplication = 2 *(x + y);
		if (x > y) {
			y = sum;
			x = multiplication; 
		}
		else {
			y = multiplication;
			x = sum; 
		}
		
		System.out.println("first real number is " + x + ", second real number is " + y);
	}
	
	public static void exercise16() {
		//16. На плоскости ХОY задана своими координатами точка А.
		//Указать, где она расположена (на какой оси или в каком координатном угле). 
		String message = "The coordinates (X,Y) are ";
		System.out.println(message);
		int x = EnterValue.randomInt();
		int y = EnterValue.randomInt();
		System.out.println("(" + x + ", " + y + ")");
		String message1 = Mathematics.findQuadrant(x, y);
		System.out.println(message1);
	}
	
	public static void exercise17() {
		//17. Даны целые числа m, n. Если числа не равны,
		//то заменить каждое из них одним и тем же числом, равным большему из исходных,
		//а если равны, то заменить числа нулями.
		String message = "The two numbers are ";
		System.out.println(message);
		int m = EnterValue.randomInt();
		int n = EnterValue.randomInt();
		System.out.println("m = " + m + ", n = " + n);
		if (m > n) {
			n = m;
		}
		if (m < n) {
			m = n;
		}
		if (m == n) {
			m = 0;
			n = 0;
		}
		System.out.println("m = " + m + ", n = " + n);
	}
	
	public static void exercise18() {
		//18. Подсчитать количество отрицательных среди чисел а, b, с.
		String message = "The three numbers are ";
		System.out.println(message);
		int a = EnterValue.randomInt();
		int b = EnterValue.randomInt();
		int c = EnterValue.randomInt();
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		int count = 0;
		if (a < 0) {
			count++;
		}
		if (b < 0) {
			count++;
		}
		if (c < 0) {
			count++;
		}
		System.out.println("There are " + count + " negative numbers");
		
	}
	
	public static void exercise19() {
		//19. Подсчитать количество положительных среди чисел а, b, с.
		String message = "The three numbers are ";
		System.out.println(message);
		int a = EnterValue.randomInt();
		int b = EnterValue.randomInt();
		int c = EnterValue.randomInt();
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		int count = 0;
		if (a > 0) {
			count++;
		}
		if (b > 0) {
			count++;
		}
		if (c > 0) {
			count++;
		}
		System.out.println("There are " + count + " positive numbers");
		
	}
	
	public static void exercise20() {
		//20. Определить, делителем каких чисел а, b, с является число k. 
		String message = "The number is ";

		int a = EnterValue.readIntFromConsole(message);
		int b = EnterValue.readIntFromConsole(message);
		int c = EnterValue.readIntFromConsole(message);
		int k = EnterValue.readIntFromConsole(message);
		if (Mathematics.isDivider(a, k)) {
			System.out.println(k + " is divider of " + a);
		}
		if (Mathematics.isDivider(b, k)) {
			System.out.println(k + " is divider of " + b);
		}
		if (Mathematics.isDivider(c, k)) {
			System.out.println(k + " is divider of " + c);
		}
	}
	
	public static void exercise21(){
		//21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М».
		//В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!»
		//или «Мне нравятся мальчики!». 
		String message = "Who are you: a boy (B) or a girl(G)?";
		char gender = EnterValue.readCharFromConsole(message);
		switch(gender){
			case 'G': 
				System.out.println("I like girls!");
				break;
			case 'B': 
				System.out.println("I like boys!");
				break;
		}
	}
	
	public static void exercise22() {
		//22. Перераспределить значения переменных х и у так,
		//чтобы в х оказалось большее из этих значений, а в y - меньшее. 
		String message = "The number is ";
		int x = EnterValue.readIntFromConsole(message);
		int y = EnterValue.readIntFromConsole(message);
		int temp = 0;
		if (x < y) {
			temp = x;
			x = y;
			y = temp;
		}
		System.out.println("x = " + x + ", y = " + y);
	}
	
	public static void exercise23() {
		//23.  Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12).
		//Если введены некорректные данные, то сообщить об этом. 
		String str = "Enter date and month";
		System.out.println(str);
		String message = "The day is ";
		int day = EnterValue.readIntFromConsole(message);
		String message2 = "The month is ";
		int month = EnterValue.readIntFromConsole(message2);
		boolean isCorrectDate = Mathematics.isCorrectDate(day, month);
		if (isCorrectDate) {
			System.out.println("Date is correct");
		}
		else {
			System.out.println("Date is incorrect");
		}
	}	
	
	public static void exercise24() {
		//24. Составить программу, определяющую результат гадания на ромашке — «любит — не любит»,
		//взяв за исходное данное количество лепестков n.
		String message = "Enter the number of petals ";
		int petals = EnterValue.readIntFromConsole(message);
		if ((petals > 0) && (petals % 2 == 0)) {
			System.out.println("does not love");
		}
		if ((petals > 0) && (petals % 2 != 0)) {
			System.out.println("loves");
		}
	}
	
	public static void exercise25() {
		//25. Написать программу — модель анализа пожарного датчика в помещении,
		//которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С. 
		String message = "The temperature is ";

		int i = 80;
		int temperature = EnterValue.randomInt2(i);
		System.out.println(message + temperature);
		if (temperature > 60) {
			System.out.println("Fire hazard");
		}
	}
	
	public static void exercise26() {
		//26. Написать программу нахождения суммы большего и меньшего из трех чисел
		String messageX = "Enter x";
		double x = EnterValue.readDoubleFromConsole(messageX);
		String messageY = "Enter y";
		double y = EnterValue.readDoubleFromConsole(messageY);
		String messageZ = "Enter z";
		double z = EnterValue.readDoubleFromConsole(messageZ);
		double min = x;
		double max = y;
		double sum = 0;
		if(x > y) {
			min = y;
			max = x;
		}
		if(z > max) {
			max = z;
		}
		if (z < min) {
			min= z;
		}
		sum = min + max;
		System.out.println("sum = " + sum);
	}
	
	public static void exercise27() {
		//27.Найти max{min(a, b), min(c, d)}.
		String message = "Enter number";
		double a = EnterValue.readDoubleFromConsole(message);
		double b = EnterValue.readDoubleFromConsole(message);
		double c = EnterValue.readDoubleFromConsole(message);
		double d = EnterValue.readDoubleFromConsole(message);

		double minAB = a;
		double minCD = c;
		double max = minAB;
		if (a > b) {
			minAB = b;
		}
		if (c > d) {
			minCD = d;
		}
		if (minAB < minCD) {
			max = minCD;
		}
		System.out.println("min(a, b) = " + minAB + ", minCD = " + minCD);
		System.out.println("max{min(a, b), min(c, d)} = " + max);
	}
	
	public static void exercise28() {
		//28.  Даны три числа a, b, с.
		//Определить, какое из них равно d.
		//Если ни одно не равно d, то найти max(d — a, d — b, d —c).
		String messageA = "Enter a";
		double a = EnterValue.readDoubleFromConsole(messageA);
		String messageB = "Enter b";
		double b = EnterValue.readDoubleFromConsole(messageB);
		String messageC = "Enter c";
		double c = EnterValue.readDoubleFromConsole(messageC);
		String messageD = "Enter d";
		double d = EnterValue.readDoubleFromConsole(messageD);
		double subDA = 0;
		double subDB = 0;
		double subDC = 0;
		double max = 0;
		boolean isEqual = false;
		if (a == d) {
			isEqual = true;
		}
		if (b == d) {
			isEqual = true;
		}
		if (c == d) {
			isEqual = true;
		}
		if (!isEqual) {
			subDA = d - a;
			subDB = d - b;
			max = Math.max(subDA, subDB);
			subDC = d - c;
			max = Math.max(max, subDC);
		}
		System.out.println("max( " + subDA + ", " + subDB + ", " + subDC + ") = " + max);
	}
	public static void exercise29() {
		//29.Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
		//Определить, будут ли они расположены на одной прямой
		String messageAX = "Enter x for A";
		int x1 = EnterValue.readIntFromConsole(messageAX);
		String messageAY = "Enter y for A";
		int y1 = EnterValue.readIntFromConsole(messageAY);
		String messageBX = "Enter x for B";
		int x2 = EnterValue.readIntFromConsole(messageBX);
		String messageBY = "Enter y for B";
		int y2 = EnterValue.readIntFromConsole(messageBY);
		String messageCX = "Enter x for C";
		int x3 = EnterValue.readIntFromConsole(messageCX);
		String messageCY = "Enter y for C";
		int y3 = EnterValue.readIntFromConsole(messageCY);
		boolean isLine = false;
		if (((x2-x1)!= 0) && ((y2-y1)!= 0)) {
			if (((x3-x1)/(x2-x1)) == (((y3-y1)/(y2-y1)))) {
				isLine = true;
			}
		}
		if (isLine) {
			System.out.println("3 points are on the same line");
		}
		else {
			System.out.println("3 points aren't on the same line");
		}
	}
	
	public static void exercise30() {
		//30. Даны действительные числа а,b,с.
		//Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
		String messageA = "Enter a";
		double a = EnterValue.readDoubleFromConsole(messageA);
		String messageB = "Enter b";
		double b = EnterValue.readDoubleFromConsole(messageB);
		String messageC = "Enter c";
		double c = EnterValue.readDoubleFromConsole(messageC);
		if ((a > b) && (b > c)) {
			a = a*2;
			b = b*2;
			c = c*2;
		}
		else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}
	
	public static void exercise31() {
		//31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		//Определить, пройдет ли кирпич через отверстие.
		int i = 40;
		String messageA = "A is ";
		int a = EnterValue.randomInt2(i);
		System.out.println(messageA + a);
		String messageB = "B is ";
		int b = EnterValue.randomInt2(i);
		System.out.println(messageB + b);
		String messageX = "x is ";
		int x = EnterValue.randomInt2(i);
		System.out.println(messageX + x);
		String messageY = "y is ";
		int y = EnterValue.randomInt2(i);
		System.out.println(messageY + y);
		String messageZ = "z is ";
		int z = EnterValue.randomInt2(i);
		System.out.println(messageZ + z);
		boolean isPass = false;
		if (a > x && b > y) {
			isPass = true;
		}
		if (a > x && b > z) {
			isPass = true;
		}
		if (a > y && b > z) {
			isPass = true;
		}
		if (a > y && b > x) {
			isPass = true;
		}
		if (a > z && b > y) {
			isPass = true;
		}
		if (a > z && b > x) {
			isPass = true;
		}
		if(isPass) {
			System.out.println("Pass");
		}
	}
	
	public static void exercise32() {
		//32. Написать программу, которая по заданным трем числам определяет,
		//является ли сумма каких-либо двух из них положительной.  
		String messageA = "Enter a";
		double a = EnterValue.readDoubleFromConsole(messageA);
		String messageB = "Enter b";
		double b = EnterValue.readDoubleFromConsole(messageB);
		String messageC = "Enter c";
		double c = EnterValue.readDoubleFromConsole(messageC);
		boolean isPositiveAB = Mathematics.isSumPositive(a, b);
		boolean isPositiveBC = Mathematics.isSumPositive(b, c);
		boolean isPositiveAC = Mathematics.isSumPositive(a, c);
		if (isPositiveAB || isPositiveBC ||isPositiveAC) {
			System.out.println("The sum of two numbers is positive");
		}
	}
	
	public static void exercise33() {
		//33. Написать программу, которая по паролю будет определять уровень доступа сотрудника
		//к секретной информации в базе данных.
		//Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа.
		//Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С;
		//3331, 7922 — доступны модули баз В, С;
		//9455, 8997 — доступен модуль базы С. 
		String message = "Enter password";
		int password = EnterValue.readIntFromConsole(message);
		switch(password) {
			case 9583:
			case 1747:
				System.out.println("Modules A, B, C are available");
				break;
			case 3331:
			case 7922:
				System.out.println("Modules B, C are available");
				break;
			case 9455:
			case 8997:
				System.out.println("Module C is available");
				break;
			default: System.out.println("Password is incorrect");
			
		}
	}
	
	public static void exercise34() {
	//34. Составить программу, реализующую эпизод применения компьютера в книжном магазине.
	//Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется,
	//печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу»
	//и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер
	//недостающей суммы
		String messageA = "Enter the cost of books";
		double cost = EnterValue.readDoubleFromConsole(messageA);
		String messageB = "Enter sum";
		double sum = EnterValue.readDoubleFromConsole(messageB);
		if (cost > 0 && sum > 0) {
			if(cost == sum) {
				System.out.println("Thank you");
			}
			if (sum > cost) {
				double diff = sum - cost;
				System.out.println("The change is " + diff);
			}
			if (sum < cost) {
				double diff = cost - sum;
				System.out.println("Not enough money " + diff);
			}
		}
	}
	
	
}
