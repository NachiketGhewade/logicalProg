package logical_Programs;

public class Self {

	public static void main(String[] args) {

		int num = 22;
		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					count++;
				}
				if (count == 2) {
					System.out.println("given no isprime no");
				} else {
					System.out.println("no is not prime");
				}
			}

		} else {
			System.out.println("no is not prime no");
		}
	}

}
