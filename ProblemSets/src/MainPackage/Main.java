package MainPackage;

public class Main {
	public static void main(String[] args) {
		MyInteger num1 = new MyInteger(3);
		MyInteger num2 = new MyInteger(8);
		System.out.println("num1 is even? " + num1.isEven());
		System.out.println("4 is odd? " + MyInteger.isOdd(4));
		System.out.println("num1 is prime? " + num1.isPrime());
		System.out.println("9 is prime? " + MyInteger.isPrime(9));
		System.out.println("num1 equals 4? " + num1.equals(4));
		System.out.println("num1 equals 3? " + num1.equals(3));
		System.out.println("num1 equals num2? " + num1.equals(num2));

		char[] CharList = { '1', '2', '3', '4' };
		System.out.println(MyInteger.parseInt(CharList));
		String MyString = "1234";
		System.out.println(MyInteger.parseInt(MyString));
	
		
		
	}

}
