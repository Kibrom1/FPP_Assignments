package w1l1;

import java.util.Scanner;
import java.lang.Math;

public class W1L2HomeWork {

	public static void convert(double amount) {

		double dollar = 1.00;
		double quarter = 0.250;
		double dime = 0.1;
		double nickel = 0.050;
		double penny = 0.010;
		int dollars = 0, quarters = 0, nickels = 0, dimes = 0, pennies = 0;
		double remainder = 0.0;
		if (amount != 0) {
			dollars = (int) (amount / dollar);
			remainder = amount % dollar;
		}
		if (remainder != 0) {
			quarters = (int) (remainder / quarter);
			remainder = remainder % quarter;
		}
		if (remainder != 0) {
			dimes = (int) (remainder / dime);
			remainder = remainder % dime;
		}
		if (remainder != 0) {
			nickels = (int) (remainder / nickel);
			remainder = remainder % nickel;
		}
		if (remainder != 0) {
			pennies = (int) (remainder / penny);
			remainder = remainder % penny;
		}
		System.out.println("Your amount " + amount + " consists of ");
		System.out.println(dollars + " dollars");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
	}

	public static boolean isLeapYear(int year) {

		return (year % 4 == 0) ? true : false;
	}

	public static boolean isPalindrome(int panam) {

		int remainder = panam % 10;
		int divide = panam / 10;
		int palim = remainder;
		while (divide > 0) {
			remainder = divide % 10;
			divide = divide / 10;
			palim = palim * 10 + remainder;
		}
		if (palim == panam)
			return true;

		return false;
	}

	public static String produceUserName() {
		System.out.println("Enter First Name:");
		String firstName;
		Scanner sc = new Scanner(System.in);
		firstName = sc.nextLine();
		System.out.println("Enter last Name:");
		String lastName;
		lastName = sc.nextLine();

		int randomNumber = (int) (Math.random() * 1000);

		return firstName.substring(0, 1) + lastName.substring(0, 5) + randomNumber;
	}

	public static void main(String[] args) {

		System.out.println("Enter an amount, for example, 11.56");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		convert(amount);

		if (isLeapYear(1804))
			System.out.println("It is leap year");

		int panam = sc.nextInt();
		if (!(9999 < panam && panam < 100000)) {
			System.out.println("The number should be five digit number");
			panam = sc.nextInt();
		}
		if (isPalindrome(panam)) {
			System.out.println("The number is Palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}

		System.out.println(produceUserName());
	}

}
