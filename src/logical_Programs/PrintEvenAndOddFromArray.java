package logical_Programs;

public class PrintEvenAndOddFromArray {

	public static void main(String[] args) {

		int a[] = { 9, 6, 5, 4, 2, 1,6,6 };
		int b;
		int even_count = 0;
		int odd_count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			b = a[i];

			if (b % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}

		}
		System.out.println("total even elements are:" + even_count);

		System.out.println("total odd elements are:" + odd_count);
	}

}
