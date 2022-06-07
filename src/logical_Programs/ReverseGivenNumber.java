package logical_Programs;

import java.util.Scanner;

public class ReverseGivenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();  //1234
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 + num%10 ; //0+4=4   43
			num = num/10 ;            // 123
		}
		
		System.out.println("reverse no is :"+ rev);
		
		
		
		//using StringBuffer class
//		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		
//		StringBuffer reve = sb.reverse();
//		System.out.println("rev no is :" +reve);
	}

}
