package logical_Programs;

public class CountWordsInString {

	public static void main(String[] args) {

		String str ="Nachiket is my name and im doing great.";
		
		int count=str.split(" ").length;
		
		System.out.println(count);
	}

}
