package logical_Programs;

import java.util.Scanner;

public class Palindrome_Number {

	// palindrome number is a number which when reversed remains same as the original number e.g 161,595,15651
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;
		
		while(num!=0) {
			
			rev = rev*10 + num%10 ;  
			num = num/10;           
		}
		if(org_num==rev) {
			
			System.out.println( rev + " the number is palindrome");
		}
		else {
			System.out.println( rev + " the number is not palindrome");
		}
		
		
	}

}
