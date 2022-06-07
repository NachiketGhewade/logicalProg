package logical_Programs;

public class CountCharacterOccurance {

	public static void main(String[] args) {

		String str = "Elephant is eating eatables";
		/*int count = 0;
		int lgth = str.length();

		for (int i = 0; i <= lgth - 1; i++) {
			str.charAt(i);

			if (str.charAt(i)=='e') {
				count++;
			}

		}
		System.out.println("e occurance in this string:" + count);*/
		
		int count=str.replaceAll("[^eE]", "").length();
		
		System.out.println("a occurance in this string:" + count);
		
		
	}

}
