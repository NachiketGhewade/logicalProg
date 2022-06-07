package logical_Programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();

		System.out.println("enter first number");
		int b = sc.nextInt();

		System.out.println("enter first number");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is the largest of three numbers");
		} else if (b > a && b > c) {
			System.out.println(b + " is the greatest of three numbers");
		} else {
			System.out.println(c + " is the greatest of three numbers");
		}

		// Ternary operators

//		int large = a>b?a:b ;
//		int largest = c>large?c:large  ;	
//		
//		System.out.println(largest+ " this is largest number out of three numbers");
	}
}
