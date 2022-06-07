package logical_Programs;

public class Palindrome_String {

	public static void main(String[] args) {

		String str = "daD";
		String org_str = str;

		StringBuffer sb = new StringBuffer(str);
//		
		StringBuffer rev = sb.reverse();
		
//		int len = str.length();
//		String rev = "";

//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//
		if (org_str.equalsIgnoreCase(rev.toString())) {
			System.out.println(org_str + " is a palindrome string");
		} else {
			System.out.println(org_str + " is not a palindrome string");
		}
	}
	
}
