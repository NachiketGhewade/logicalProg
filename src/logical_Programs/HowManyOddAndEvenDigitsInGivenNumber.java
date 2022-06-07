package logical_Programs;

public class HowManyOddAndEvenDigitsInGivenNumber {

	public static void main(String[] args) {

		int num = 2222;
		int ref = 0;
		int even_count = 0; 
		int odd_count = 0;

		while (num > 0) {
			ref = num % 10;
			if (ref % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			num = num / 10;
		}

		System.out.println("total even nos in given number are:" + even_count);

		System.out.println("total odd nos in given number are:" + odd_count);

	}

}
