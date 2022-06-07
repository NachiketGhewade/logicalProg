package logical_Programs;

public class Reverse_String {

	public static void main(String[] args) {
		
		String str = "Nachiket";
		int len = str.length();
		String rev="";
		
		
		for(int i =len-1;i>=0;i--) {
			rev =rev+ str.charAt(i);
		}
		System.out.println("reverse string is:"+ rev);
		
//		StringBuffer sb = new StringBuffer(str);
//		
//		System.out.println("Reverse string is: "+sb.reverse());
	}
}
