package logical_Programs;

public class PalindromeOrNot {

	public static void main(String[] args) {

		String str = "Dad";
		int len = str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			
		 rev = rev + str.charAt(i);
		}
//		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev)){
			System.out.println("Given String is palindrome"+"  "+rev);
		}
		else {
			System.out.println("Given string is not palindrome"+"  "+rev);
		}
		
		
		
	}

}
