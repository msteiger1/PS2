package MainPackage;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}

	public static boolean isOdd(int value) {
		return (value % 2 != 0);
	}

	public static boolean isPrime(int value) {
		int p = 0;
		for (p = 2; p <= value / 2; p++) {
			if (value % p != 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isEven() {
		return isEven(value);
	}

	public boolean isOdd() {
		return isOdd(value);
	}

	public boolean isPrime() {
		return isPrime(value);
	}

	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}

	public static boolean isOdd(MyInteger value) {
		return value.isOdd();
	}

	public static boolean isPrime(MyInteger value) {
		return value.isPrime();
	}

	public boolean equals(int Myint) {
		return (value == Myint);
	}
	

	public static int parseInt(String MyString) {
		return Integer.parseInt(MyString);
	}

	public static int parseInt(char[] CharList) {
		return parseInt(new String(CharList));
	}

}
