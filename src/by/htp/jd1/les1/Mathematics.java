package by.htp.jd1.les1;

public class Mathematics {
	public static double powerValue(double value, int power1, int power2) {
		if (value > 0) {
			value = Math.pow(value, power1);
			return value;
		}
		else {
			value = Math.pow(value, power2);
			return value;
		}
	}
	
	public static double findDistance(int x1, int y1, int x2, int y2) {
		double distance =Math.sqrt(Math.sqrt(x2 - x1) + Math.sqrt(y2 - y1));
		return distance;
	}
	
	public static boolean findTriangle(int x, int y) {
		boolean isTriangle = false;
		if (((x + y) < 180) && (x > 0 && y > 0)) {
			isTriangle = true;
		}
		return isTriangle;
	}
	
	public static boolean findRectangularTriangle(int x, int y) {
		boolean isRectangular = false;
		if ((x + y) == 180) {
			isRectangular = true;
		}
		return isRectangular;
	}
	
//���������� int 1,2,3,4
	public static String findQuadrant(int x, int y) {
		String str = new String();
		if ((x > 0) && (y > 0)) {
			str = "First quadrant";
		}
		if ((x < 0) && (y > 0)) {
			str = "Second quadrant";
		}
		if ((x < 0) && (y < 0)) {
			str = "Third quadrant";
		}
		if ((x > 0) && (y < 0)) {
			str = "Fourth quadrant";
		}
		return str;
	}
	
	public static boolean isDivider(int x, int k) {
		boolean divider = false;
		if (x % k == 0) {
			divider = true;
		}
		return divider;
	}

	public static boolean isCorrectDate(int day, int month) {
		boolean isCorrect = true;
		if ((day > 32) || (day < 0)){
			isCorrect = false;
		}
		if((month > 12) || (month < 0)) {
			isCorrect = false;
		}
		if ((month == 2) && (day > 29)) {
			isCorrect = false;
		}

		if ((month == 4) && (day == 31)) {
			isCorrect = false;
		}
		if ((month == 6) && (day == 31)) {
			isCorrect = false;
		}
		if ((month == 9) && (day == 31)) {
			isCorrect = false;
		}
		if ((month == 11) && (day == 31)) {
			isCorrect = false;
		}
		return isCorrect;
	}
	
	public static boolean isSumPositive(double a, double b) {
		boolean isPositive = false;
		if (a <= 0 && b <=0) {
			return isPositive;
		}
		if (a > 0 && b >= 0) {
			isPositive = true;
		}
		if (a >= 0 && b > 0) {
			isPositive = true;
		}
		if (a > b || b > a) {
			isPositive = true;
		}
		return isPositive;
	}

}
