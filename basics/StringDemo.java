import java.util.*;

public class StringDemo {
	public static void main(String args[]) {
		/*
		 * Strings are immutable with respect to String class
		 * 
		 * String Constant Pool:
		 * In Jvm there is special area konown as string constant pool(SCP)
		 * whenever we create a string,first it is checked in SCP whether
		 * it is present or not.If present reference to that string is provided
		 * otherwise a new string is created
		 * 
		 * Strings are mutable with respect to StringBuffer and StringBuilder classes
		 * 
		 * StringBuffer is thread safe and StringBuilder is not
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		String c = "My input number is " + a;
		System.out.println(c);
	}
}
