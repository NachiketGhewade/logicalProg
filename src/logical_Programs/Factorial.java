package logical_Programs;

public class Factorial {

	public static void main (String[]args) {
		int num = 6;
		long factorial=1;
		
//		for(int i=num; i>=1;i--) {
//			
//			factorial=factorial * i;
//			
//		}
//		System.out.println("factorial of a given number is :" + factorial);
		
		for(int i=1;i<=6;i++) {
			
			factorial = factorial * i;
		}
		System.out.println("factorial of a given number is :" + factorial);
	}
	
	
	
	
	
	
	
	
}


